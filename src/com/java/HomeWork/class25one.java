package com.java.HomeWork;

    // Page class
    class Page {
        public Page() {
            System.out.println("Page constructor called");
        }

        public void loadPage() {
            System.out.println("Page loaded successfully");
        }

        public boolean isPageLoaded() {
            return true;
        }
    }

    // LoginPage class
    class LoginPage extends Page {
        public void doLogin() {
            System.out.println("Logged in successfully");
        }

        public void logout() {
            System.out.println("Logged out successfully");
        }
    }

    // HomePage class
    class HomePage extends Page {
        public void openHomePage() {
            System.out.println("Homepage opened successfully");
        }

        public boolean verifyLogo() {
            return true;
        }
    }

    // MainClass
    public class class25one {
        public static void main(String[] args) {
            LoginPage loginPage = new LoginPage();
            loginPage.doLogin();
            loginPage.logout();

            HomePage homePage = new HomePage();
            homePage.openHomePage();
            boolean logoVerified = homePage.verifyLogo();
            if (logoVerified) {
                System.out.println("Homepage logo verified successfully");
            } else {
                System.out.println("Homepage logo verification failed");
            }
        }
    }


