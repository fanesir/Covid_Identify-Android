package flag;

public class Sort { // ���ѱƧǥ\�઺���O
  public static void bubbleSort(ICanCompare[] objs) {
    // ��w�ƧǪk
    for(int i = objs.length - 1;i > 0;i--) {
      for(int j = 0;j < i;j++) {
        if(objs[j].compare(objs[j + 1]) < 0) {
          ICanCompare temp = objs[j];
          objs[j] = objs[j + 1];
          objs[j + 1] = temp;
        }
      }
    }
  }
}
