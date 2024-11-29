public class Latihan3SEPATU {
    public static void main(String[] args) {
        String  merk = "nike", kategori = "adult";
        int ukuran = 44;
        
        if (merk.equals("converse")) {
            if (kategori.equals("slipon")) {
                if (ukuran >= 36){
                    if (ukuran <= 40){
                        System.out.println("Harga 800.000");
                    }else {
                        System.out.println("Ukuran Sepatu Converse hanya di dalam range 36-40");
                    }
                }else {
                    System.out.println("Ukuran Sepatu Converse slipon hanya di dalam range 36-40");
                }
            }else if (kategori.equals("hightop")){
                if (ukuran > 40){
                    if (ukuran <= 44){
                        System.out.println("Harga 1.200.000");
                    }else {
                        System.out.println("Ukuran Sepatu Converse Hightop hanya di dalam range 41-44");
                    }
                }else { 
                    System.out.println("Ukuran Sepatu Converse hightop hanya di dalam range 41-44");
                }
            }else {
                System.out.println("Kategori Sepatu Converse tidak tersedia.");
            }
        }else if (merk.equals("sketcher")){
            if (kategori.equals("woman")){
                if (ukuran >= 36){
                    if (ukuran <= 41 ){
                        System.out.println("Harga 1.000.000");
                    }else {
                        System.out.println("Ukuran Sepatu Sketcher Woman hanya di dalam range 36-41");
                    }
                }else {
                    System.out.println("Ukuran Sepatu Sketcher hanya di dalam range 36-41");
                }
            }else if (kategori.equals("man")){
                if (ukuran > 41){
                    if (ukuran <= 44){
                        System.out.println("Harga 1.800.000");
                    }else {
                        System.out.println("Ukuran Sepatu Sketcher Man hanya di dalam range 42-44");
                    }
            }else {
                System.out.println("Ukuran Sepatu Sketcher Man hanya di dalam range 42-44.");
            }
        }else {
            System.out.println("Kategori Sepatu Sketcher tidak tersedia.");
        }

        }else if (merk.equals("nike")){
            if (kategori.equals("kids")){
                if (ukuran >= 36){
                    if (ukuran <= 40){
                        System.out.println("Harga 750.000");
                    } else {
                        System.out.println("Ukuran Sepatu Nike Kids hanya di dalam range 36-40");
                    }
                } else {
                    System.out.println("Ukuran Sepatu Nike hanya di dalam range 36-40");
                }
            } else if (kategori.equals("adult")){
                if (ukuran > 40){
                    if (ukuran <= 44){
                        System.out.println("Harga 1.500.000");
                    } else {
                        System.out.println("Ukuran Sepatu Nike Adult hanya di dalam range 41-44");
                    }
                }else {
                    System.out.println("Ukuran Sepatu Nike hanya di dalam range 41-44.");
                }
                
            }else {
                System.out.println("Kategori Sepatu Nike tidak tersedia.");
            }
    
            }else {
                System.out.println("Merk Sepatu yang anda pilih salah.");
            }
        }
        }


