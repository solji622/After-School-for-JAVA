package classExample;

//파라미터로 정수 배열 intArray를 받고 배열의 모든 값의 평균을 리턴해주는 메소드 computerAverage를 작성하시오
class AverageFinder{
    int sum = 0;
    double computerAverage(int[] intArray){
        for(int num : intArray){
            sum += num;
        }
        return (double) sum / intArray.length;
    }
}
public class Ex01 {
    public static void main(String[] args) {

        AverageFinder finder = new AverageFinder();

        int[] testArray1 = {3, 7, 3};
        System.out.println(finder.computerAverage(testArray1));
    }

}
