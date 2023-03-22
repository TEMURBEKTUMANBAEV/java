package com.java.HomeWork;

// AndroidPhone class
    class AndroidPhone extends phone {
        @Override
        public void repair() {
            System.out.println("Repairing Android phone...");
        }
    }

    // IPhone class
    class IPhone extends phone {
        @Override
        public void repair() {
            System.out.println("Repairing iPhone...");
        }
    }

    // ServiceCenter class
    class ServiceCenter {
        public void servicePhone(phone phone1) {
            System.out.println("Service Center is servicing the phone...");
            phone1.repair();
        }
    }

    // MainClass
    public class class28one {
        public static void main(String[] args) {
            AndroidPhone androidPhone = new AndroidPhone();
            IPhone iPhone = new IPhone();
            ServiceCenter serviceCenter = new ServiceCenter();

            serviceCenter.servicePhone(androidPhone); // Servicing Android phone
            serviceCenter.servicePhone(iPhone); // Servicing iPhone
        }
    }


