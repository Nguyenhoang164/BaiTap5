import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XayDungLopMobile {
    static class Mobile {
        private int battery;
        public String composingMsg;
        public List<String> inbox;
        public List<String> outbox;
        private boolean isOn;


        public Mobile() {
            this.battery = 100;
            this.composingMsg = "";
            this.inbox = new ArrayList<>();
            this.outbox = new ArrayList<>();
            this.isOn = false;
        }

        public boolean isOn() {
            return isOn;
        }

        public void turnOn() {
            isOn = true;
        }

        public void togglePower() {
            if (isOn) {
                isOn = false;
                System.out.println("Mobile is turned off.");
            } else {
                isOn = true;
                System.out.println("Mobile is turned on.");
            }
            decreaseBattery();
        }

        public int ShowBattery() {
            return this.battery;
        }

        public void chargeBattery() {
            battery = 100;
            System.out.println("Battery is fully charged.");
        }

        public String composeMessage(String message) {
            composingMsg = message;
            decreaseBattery();
            return message;
        }

        public void receiveMessage(String message) {
            inbox.add(message);
            System.out.println("A new message has been received.");
            decreaseBattery();
        }

        public void sendMessage(Mobile receiver, String message) {
            if (isOn && receiver.isOn) {
                outbox.add(message);
                receiver.receiveMessage(message);
                System.out.println("Message has been sent.");
                decreaseBattery();
            } else {
                System.out.println("Failed to send message.");
            }
        }

        public void viewInbox() {
            if (inbox.isEmpty()) {
                System.out.println("Inbox is empty.");
            } else {
                System.out.println("Inbox:");
                for (String message : inbox) {
                    System.out.println(message);
                }
                decreaseBattery();
            }
        }

        public void viewOutbox() {
            if (outbox.isEmpty()) {
                System.out.println("Outbox is empty.");
            } else {
                System.out.println("Outbox:");
                for (String message : outbox) {
                    System.out.println(message);
                }
                decreaseBattery();
            }
        }

        public void decreaseBattery() {
            battery--;
            if (battery == 0) {
                isOn = false;
                System.out.println("DED BATTERY. GO TOUCH SOME GRASS.");
            }
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Mobile nokia = new Mobile();
            Mobile iphone = new Mobile();

            System.out.println("Chao mung den voi gia lap he dieu hanh nokia va iphone");
            System.out.println("Moi chon che do dien thoai");
            System.out.println("1. Nokia cuc gach sieu cap vip pro");
            System.out.println("2. iphone chua te hieu nang");
            System.out.println("3. Huy ");
            int chose = input.nextInt();
            for (int i = 0; i <= nokia.battery; i++) {
                switch (chose) {
                    case 1:
                        nokia.turnOn();
                        System.out.println("chao mung den voi giao dien nokia cuc gach sieu cap vip pro , " + "pin con lai cua may " + nokia.ShowBattery());
                        System.out.println("List-menu");
                        System.out.println("1. tin nhan moi");
                        System.out.println("2. hop thu den");
                        System.out.println("3. Hop thu da gui");
                        System.out.println("4. Tat nguon");
                        System.out.println("5. sac pin");
                        int chosenokia = input.nextInt();

                        switch (chosenokia) {
                            case 1:
                                System.out.println("Tien hanh soan tin nhan ");
                                String message = "Hello";
                                nokia.sendMessage(iphone, message);
                                iphone.viewInbox();
                                nokia.decreaseBattery();
                                break;
                            case 2:
                                System.out.println("chao mung den voi hop thu den ");
                                nokia.viewInbox();
                                break;
                            case 3:
                                System.out.println("Chao mung den voi hop thu da gui");
                                nokia.viewOutbox();
                                break;
                            case 4:
                                System.out.println("tien hanh tat nguon , hen gap lai ");
                                nokia.togglePower();
                                break;
                            case 5:
                                System.out.println("tien hanh sac may ");
                                nokia.chargeBattery();
                                for (int j = nokia.battery; j <= 100; j++) {
                                    System.out.println(j + "%" + " ");
                                }

                                break;
                            default:
                                System.out.println("loi khong tim thay dich vu");
                                break;

                        }

                        break;
                    case 2:
                        iphone.turnOn();
                        System.out.println("chao mung den voi giao dien iphone chua te hieu nang , " + "pin con lai cua may " + iphone.ShowBattery());
                        System.out.println("List-menu");
                        System.out.println("1. tin nhan moi");
                        System.out.println("2. hop thu den");
                        System.out.println("3. Hop thu da gui");
                        System.out.println("4. Tat nguon");
                        System.out.println("5. sac pin");
                        int choniphone = input.nextInt();
                        switch (choniphone) {
                            case 1:
                                System.out.println("Tien hanh soan tin nhan ");
                                String message = " hello";
                                iphone.sendMessage(iphone, message);

                                break;
                            case 2:
                                System.out.println("chao mung den voi hop thu den ");
                                iphone.viewInbox();
                                break;
                            case 3:
                                System.out.println("Chao mung den voi hop thu da gui");
                                iphone.viewOutbox();
                                break;
                            case 4:
                                System.out.println("tien hanh tat nguon , hen gap lai ");
                                iphone.togglePower();
                                break;
                            case 5:
                                System.out.println("tien hanh sac may ");
                                iphone.chargeBattery();
                                break;
                            default:
                                System.out.println("loi khong tim thay dich vu");
                                break;
                        }
                        break;

                    default:
                        System.out.println("loi khong tim thay dich vu");
                        break;
                }
            }

        }
    }
}
