public class Main {
    public static void main(String[] args){
int sPS1 =123;
int ePS1 =476;
int sPS2 = 108;
int ePS2 =144;
int sPS3;
int ePS3;
if (sPS1<ePS1 && sPS1<sPS2 && ePS2>ePS1 && ePS2>sPS2 && ePS1==sPS2) {
    sPS3=ePS1;
    System.out.println("Точка пересечения " + sPS3 );
} else if (sPS2<ePS2 && sPS2<sPS1 && ePS2 < ePS1 && sPS1<ePS1 && ePS2==sPS1) {
    sPS3=ePS2;
    System.out.println( "Точка пересечения " + sPS3);
} else if (sPS1 < ePS1 && ePS1 < sPS2 && sPS2 < ePS2) {
    System.out.println(" Отрезки не пересекаются ");
} else if (sPS1 > ePS1 && ePS1 > sPS2 && sPS2 > ePS2) {
    System.out.println(" Отрезки не пересекаются ");
} else if (sPS1 < sPS2 && sPS2 < ePS2 && ePS2< ePS1) {
    sPS3 = sPS2;
    ePS3 = ePS2;
    System.out.println(" Точки пересечения отрезков " + sPS3 + " и " + ePS3);
} else if (sPS2 < sPS1 && sPS1 < ePS1 && ePS1 < ePS2) {
    sPS3=sPS1;
    ePS3=ePS1;
    System.out.println(" Точки пересечения отрезков "+sPS3+" и "+ePS3  );
} else if (sPS1 < sPS2 && sPS2 < ePS1 && ePS1 < ePS2) {
    sPS3=sPS2;
    ePS3=ePS1;
    System.out.println("Точки пересечения отрезков "+sPS3+" и "+ePS3  );
} else if (sPS2 < sPS1 && sPS1 < ePS2 && ePS2 < ePS1) {
    sPS3 = sPS1;
    ePS3 = ePS2;
    System.out.println("Точки пересечения отрезков " + sPS3 + " и " + ePS3);
}else if (sPS1 > ePS1 && ePS1 < sPS2 && sPS2 < ePS2) {
    sPS3=sPS2;
    ePS3=ePS2;
    System.out.println("Точки пересечения отрезков "+sPS3+" и "+ePS3  );
}else if (sPS1 > ePS1 && ePS1 > sPS2 && sPS2 < ePS2) {
    sPS3=ePS1;
    ePS3=sPS1;
    System.out.println("Точки пересечения отрезков "+sPS3+" и "+ePS3  );
}else if (sPS1==ePS2 && ePS1==sPS2) {
    sPS3=ePS1;
    ePS3=ePS2;
    System.out.println("Точки пересечения отрезков "+sPS3+" и "+ePS3  );
}else if (sPS1==ePS2 && ePS1>sPS2) {
    sPS3=ePS2;
    ePS3=sPS2;
    System.out.println("Точки пересечения отрезков "+sPS3+" и "+ePS3  );
}else if (sPS1==ePS2 && ePS1<sPS2) {
    sPS3=ePS2;
    System.out.println("Точка пересечения " + sPS3  );
} else if (sPS1 < sPS2 && sPS2<ePS2 && sPS2 > ePS2 && ePS2< ePS1 && ePS1 != sPS2) {
    sPS3=ePS2;
    ePS3=sPS2;
    System.out.println(" Точки пересечения отрезков "+sPS3+" и "+ePS3  );
} else if (sPS1 < ePS1 && ePS2 < sPS2 && ePS1==sPS2) {
    sPS3=ePS1;
    System.out.println("Точка пересечения " + sPS3 );
} else if (sPS1 > ePS1 && ePS1<sPS2 && sPS2 > ePS2) {
    sPS3=ePS1;
    ePS3=sPS1;
    System.out.println(" Точки пересечения отрезков "+sPS3+" и "+ePS3  );
} else {
    System.out.println(" Отрезки не пересекаются ");
      }
    }
}