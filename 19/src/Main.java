import static java.lang.System.out;
interface menClothes{
    void dressMan();
}
interface womenClothes{
    void dressWoman();
}
enum clothesSize{
    XXS(32){
        @Override
        public String getDescription(){
            return "Детский размер";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    private int euroSize;

    clothesSize(int euroSize){
        this.euroSize = euroSize;
    }
    public int getEuroSize() {
        return euroSize;
    }
    public String getDescription(){
        return "Взрослый размер";
    }
}
abstract class Clothes{
    clothesSize size;
    int cost;
    String color;
    Clothes(clothesSize size, int cost, String color){
        this.size = size;
        this.cost = cost;
        this.color = color;
    }
    @Override
    public String toString() {
        return String.format("{размер= %s(%s), цена= %d руб, цвет= %s, описание= %s}",
                size,size.getEuroSize(),cost,color,size.getDescription());
    }
}
class TShirt extends Clothes implements menClothes, womenClothes{
    TShirt(clothesSize size, int cost, String color){
        super(size,cost,color);
    }
    @Override
    public void dressMan(){
        out.println("Мужская футболка " + this);
    }
    @Override
    public void dressWoman(){
        out.println("Женская футболка " + this);
    }
}
class Pants extends Clothes implements menClothes, womenClothes{
    Pants(clothesSize size, int cost, String color){
        super(size,cost,color);
    }
    @Override
    public void dressMan(){
        out.println("Мужские штаны " + this);
    }
    @Override
    public void dressWoman(){
        out.println("Женские штаны " + this);
    }
}
class Skirts extends Clothes implements womenClothes{
    Skirts(clothesSize size, int cost, String color){
        super(size,cost,color);
    }
    @Override
    public void dressWoman(){
        out.println("Юбка " + this);
    }
}
class Ties extends Clothes implements menClothes{
    Ties(clothesSize size, int cost, String color){
        super(size,cost,color);
    }
    @Override
    public void dressMan(){
        out.println("Галстук " + this);
    }
}
class Atelie{
    public static void dressMan(Clothes[] clothes){
        out.println("Мужская одежда");
        for(Clothes cl : clothes){
            if(cl instanceof menClothes)
                ((menClothes) cl).dressMan();
        }
    }
    public static void dressWoman(Clothes[] clothes){
        out.println("Женская одежда");
        for(Clothes cl : clothes){
            if(cl instanceof womenClothes)
                ((womenClothes) cl).dressWoman();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(clothesSize.L,1850,"Чёрный"),
                new TShirt(clothesSize.XXS,1990,"Белый"),
                new Pants(clothesSize.M,4599,"Коричневый"),
                new Skirts(clothesSize.S,2599,"Синий"),
                new Ties(clothesSize.XS,799,"Красный")
        };
        Atelie.dressMan(clothes);
        Atelie.dressWoman(clothes);
    }
}