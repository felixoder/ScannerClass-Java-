    // Scanner.java
    public class MyScanner {
        private java.io.BufferedReader reader;

        public MyScanner(java.io.InputStream in) {
            reader = new java.io.BufferedReader(new java.io.InputStreamReader(in));
        }

        public String nextLine() {
            try {
                return reader.readLine();
            } catch (java.io.IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        public int nextInt() {
            try {
                return Integer.parseInt(reader.readLine());
            } catch (java.io.IOException e) {
                e.printStackTrace();
                return 0;
            }
        }
    }
