package HJ_project;

import java.util.HashMap;
import java.util.Scanner;

public class BankApp {

    private HashMap<String, Bank_DTO> users;
    private Bank_DTO loggedInUser;

    public BankApp() {
        users = new HashMap<>();
        loggedInUser = null;
    }

    public void run(Scanner input) {
        boolean run = true;
        int num;
        String username, password;
        double amount;

        while (run) {
            System.out.println("1. 로그인");
            System.out.println("2. 잔액확인");
            System.out.println("3. 입금");
            System.out.println("4. 출금");
            System.out.println("5. 송금");
            System.out.println("6. 종료");
            System.out.println("7. 로그아웃");
            System.out.println("8. 회원가입");
            System.out.println(">>> ");
            num = input.nextInt();

            switch (num) {
                case 1:
                    if (!users.isEmpty()) {
                        System.out.println("아이디 입력: ");
                        username = input.next();
                        System.out.println("패스워드 입력: ");
                        password = input.next();
                        login(username, password);
                    } else {
                        System.out.println("로그인 할 계정이 없습니다.");
                    }
                    break;
                case 2:
                    if (loggedInUser != null) {
                        loggedInUser.checkBalance();
                    } else {
                        System.out.println("로그인된 사용자가 없습니다.");
                    }
                    break;
                case 3:
                    if (loggedInUser != null) {
                        System.out.println("입금 할 금액: ");
                        amount = input.nextDouble();
                        loggedInUser.deposit(amount);
                    } else {
                        System.out.println("로그인된 사용자가 없습니다.");
                    }
                    break;
                case 4:
                    if (loggedInUser != null) {
                        if (loggedInUser.checkBalance() > 0) {
                            System.out.println("출금 할 금액: ");
                            amount = input.nextDouble();
                            loggedInUser.withdraw(amount);
                        } else {
                            System.out.println("출금 할 금액이 없습니다.");
                        }
                    } else {
                        System.out.println("로그인된 사용자가 없습니다.");
                    }
                    break;
                case 5:
                    if (loggedInUser != null) {
                        if (loggedInUser.checkBalance() > 0) {
                            System.out.println("송금 할 이름: ");
                            String recipientUsername = input.next();
                            Bank_DTO recipient = users.get(recipientUsername);
                            if (recipient != null) {
                                System.out.println("송금 할 금액: ");
                                amount = input.nextDouble();
                                loggedInUser.transfer(recipient, amount);
                            } else {
                                System.out.println("해당 사용자가 존재하지 않습니다.");
                            }
                        } else {
                            System.out.println("송금 할 금액이 없습니다.");
                        }
                    } else {
                        System.out.println("로그인된 사용자가 없습니다.");
                    }
                    break;
                case 6:
                    run = false;
                    break;
                case 7:
                    logout();
                    break;
                case 8:
                    System.out.println("아이디 입력: ");
                    username = input.next();
                    System.out.println("패스워드 입력: ");
                    password = input.next();
                    addUser(username, password, 0);
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }

    public void addUser(String username, String password, double initialBalance) {
        users.put(username, new Bank_DTO(username, password, initialBalance));
    }

    public void login(String username, String password) {
        Bank_DTO user = users.get(username);
        if (user != null && user.checkPassword(password)) {
            loggedInUser = user;
            System.out.println(username + "님 환영합니다");
        } else {
            System.out.println("아이디, 패스워드를 체크해주세요.");
        }
    }

    public void logout() {
        if (loggedInUser != null) {
            System.out.println(loggedInUser.getUsername() + "님 로그아웃되었습니다.");
            loggedInUser = null;
        } else {
            System.out.println("로그인된 사용자가 없습니다.");
        }
    }
}
