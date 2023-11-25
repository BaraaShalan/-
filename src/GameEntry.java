
    public class GameEntry {
        int score;



        public static void main(String[] args) {
            GameEntry[] A = new GameEntry[5];
            for (int i = 0; i < 5; i++) {
                A[i] = new GameEntry();
                A[i].score = i;
            }

            GameEntry[] B = A.clone();

            A[4].score = 550;

            System.out.println(B[4].score);
        }
    }

