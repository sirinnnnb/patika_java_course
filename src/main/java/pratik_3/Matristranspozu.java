package pratik_3;

public class Matristranspozu {
        public static void main(String[] args) {

            //  Matrisimizi oluşturduk (2 satır, 3 sütun)
            int[][] matris = {
                    {1, 2, 3},
                    {4, 5, 6}
            };

            //  Transpoz matrisini tanımladık (3 satır, 2 sütun)
            int[][] transpoz = new int[3][2];

            // Transpoz alma işlemi: satır ve sütunları yer değiştiriyoruz
            for (int i = 0; i < 2; i++) { // satırlar
                for (int j = 0; j < 3; j++) { // sütunlar
                    transpoz[j][i] = matris[i][j];
                }
            }

            //  Transpoz matrisini yazdır
            System.out.println("Transpoz:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(transpoz[i][j] + " ");
                }
                System.out.println(); // bir satır aşağı in
            }
        }
    }


