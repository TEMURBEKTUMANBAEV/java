package com.java.HomeWork;

    interface Browser {
        void launch();

        void browse(String url);

        void close();
    }

    class Chrome implements Browser {
        @Override
        public void launch() {
            System.out.println("Launching Chrome...");
        }

        @Override
        public void browse(String url) {
            System.out.println("Browsing URL: " + url);
        }

        @Override
        public void close() {
            System.out.println("Closing Chrome...");
        }
    }

    class Firefox implements Browser {
        @Override
        public void launch() {
            System.out.println("Launching Firefox...");
        }

        @Override
        public void browse(String url) {
            System.out.println("Browsing URL: " + url);
        }

        @Override
        public void close() {
            System.out.println("Closing Firefox...");
        }
    }

    class Edge implements Browser {
        @Override
        public void launch() {
            System.out.println("Launching Edge...");
        }

        @Override
        public void browse(String url) {
            System.out.println("Browsing URL: " + url);
        }

        @Override
        public void close() {
            System.out.println("Closing Edge...");
        }
    }

    class Safari implements Browser {
        @Override
        public void launch() {
            System.out.println("Launching Safari...");
        }

        @Override
        public void browse(String url) {
            System.out.println("Browsing URL: " + url);
        }

        @Override
        public void close() {
            System.out.println("Closing Safari...");
        }
    }

    public class class31one  {
        public static void main(String[] args) {
            Browser chrome = new Chrome();
            chrome.launch();
            chrome.browse("https://www.google.com");
            chrome.close();

            Browser firefox = new Firefox();
            firefox.launch();
            firefox.browse("https://www.yahoo.com");
            firefox.close();

            Browser edge = new Edge();
            edge.launch();
            edge.browse("https://www.microsoft.com");
            edge.close();

            Browser safari = new Safari();
            safari.launch();
            safari.browse("https://www.apple.com");
            safari.close();
        }
    }


