package lang.math.ex;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] lottoNumbers = lottoGenerator.generate();

        // 생성된 로또 번호 출력
        for (int lottoNumber : lottoNumbers) {
            System.out.print(lottoNumber + " ");
        }
    }
}
