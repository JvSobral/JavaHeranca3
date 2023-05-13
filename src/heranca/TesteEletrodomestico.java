
package heranca;

public class TesteEletrodomestico {
    public static void main(String[] args) {
        
    
        Chuveiro c = new Chuveiro(1245, 3 , "Lorenzetti ", "Aqua duo", 5500);
        System.out.println(c);
        
        Televisao tv = new Televisao(4590, 25 , "Samsung", "Smart TV LED", 55 , "OLED");
        System.out.println(tv);
        
        Microondas mc = new Microondas(7589, 45 , "Eletrolux" , "Microondas 31", 31.0);
        System.out.println(mc);
        
        MaquinaDeLavar ml = new MaquinaDeLavar(6873,  180, "Brastemp" , "Lavadora 12", "Lava e seca ", "Branco" , 12);
        System.out.println(ml); 
        
        Industrial id = new Industrial(0630, 80 , "Cristalaço", "Idustrial " , 6 , 3.40, 5.80);
        System.out.println(id);
        
        Domestico dm = new Domestico (5673,  50 , "Brastemp" , "Fogão 5 ", 5 , 2.80, "A Gás");
        System.out.println(dm);
        
        
    
    } 
}
