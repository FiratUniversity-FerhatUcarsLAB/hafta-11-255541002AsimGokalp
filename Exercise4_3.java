public class Exercise4_3 {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }
	/** 1. sory: Bu soruda, ping metodunun ilk kez çağrıldığı anda çağrı yığınının (stack) durumunu olduu. Program  main metodundan başlıyor. Önce main içindeki System.out.print("No, I "); çalışıyor, ardından zoop(); çağrılıyor. Bu anda çağrı yığınının en altında main, onun üstünde de zoop metodu bulunuyor.
zoop metodunun içinde bu kez baffle(); çağrılıyor. Böylece stack’e bir seviye daha ekleniyor ve baffle en üstte olacak şekilde sıralama main → zoop → baffle haline geliyor. baffle metodu System.out.print("wug"); satırını çalıştırdıktan sonra ping(); metodunu çağırıyor.
İşte ping metodunun ilk kez çağrıldığı anda çağrı yığını şu şekilde oluyor:
En altta: main(String[] args)
Onun üzerinde: zoop()
Onun üzerinde: baffle()
En üstte (aktif olan): ping()
Yani alttan üste doğru çağrı sırası: main → zoop → baffle → ping şeklindedir.
2. soru
No, I wug.
You wugga wug.
I wug.

    */
    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }
}
