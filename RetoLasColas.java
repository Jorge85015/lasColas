import java.lang.Math;
public class RetoLasColas{
    public static void main(String[] args){
        
        int TiempoDeAtencion, PersonasEnCola;
        double ProbNuevoCliente;
        double PacksCaja1, PacksCaja2, PacksCaja3, PacksCaja4;
        int Caja1, Caja2, Caja3, Caja4;
        int TiempoColaVacia, PersonasAtendidas, TotalPacksVendidos;

        TiempoDeAtencion = 0;
        PersonasEnCola = 0;
        Caja1 = 0;
        Caja2 = 0;
        Caja3 = 0;
        Caja4 = 0;
        PacksCaja1 = 0;
        PacksCaja2 = 0;
        PacksCaja3 = 0;
        PacksCaja4 = 0;
        TiempoColaVacia = 0;
        PersonasAtendidas = 0;
        TotalPacksVendidos = 0;
        
        while(TiempoDeAtencion < 720){                  // El tiempo está expresado en minutos
            TiempoDeAtencion = TiempoDeAtencion + 1;
            
            System.out.println("Minuto: " + TiempoDeAtencion);
            if(TiempoDeAtencion > 60){
                System.out.println("Hora: " + ((int)TiempoDeAtencion/60));
            }

            ProbNuevoCliente = Math.random()*(100);
            
            if((int)ProbNuevoCliente <= 40){
                PersonasEnCola = PersonasEnCola + 1;
                System.out.println("Llego una nueva persona a la cola");
                System.out.println("La cola tiene: " + PersonasEnCola + " Persona/s");
            }
            else if(PersonasEnCola == 0){
                System.out.println("La cola tiene: 0 Personas");
                TiempoColaVacia = TiempoColaVacia + 1;
            }
            
//Caja #1 ------------------------------------------------------------------------            
               
            if(Caja1 == 0 && PersonasEnCola > 0){
                PersonasEnCola = PersonasEnCola - 1;
                PacksCaja1 = Math.random()*(15-5)+5;
                Caja1 = 1;    
                System.out.println("La caja #1 atendera " + (int)PacksCaja1 + " Packs de items");
                TotalPacksVendidos = TotalPacksVendidos + (int)PacksCaja1;
            }

            if(Caja1 == 0){
                System.out.println("La caja #1 esta vacia");
            }
            
            if(Caja1 == 1){             
                PacksCaja1 = PacksCaja1 - 1;
                System.out.println("La caja #1 esta ocupada");
                if((int)PacksCaja1 == 0){
                    Caja1 = 0;
                    PersonasAtendidas = PersonasAtendidas + 1;
                }
            }
//Caja #2 ------------------------------------------------------------------------            

            if(Caja1 == 1 && Caja2 == 0 && PersonasEnCola > 0){
                PersonasEnCola = PersonasEnCola - 1;
                PacksCaja2 = Math.random()*(15-5)+5;
                Caja2 = 1;    
                System.out.println("La caja #2 atendera " + (int)PacksCaja2 + " Packs de items");
                TotalPacksVendidos = TotalPacksVendidos + (int)PacksCaja2;
            }

            if(Caja2 == 0){
                System.out.println("La caja #2 esta vacia");
            }
            
            if(Caja2 == 1){             
                PacksCaja2 = PacksCaja2 - 1;
                System.out.println("La caja #2 esta ocupada");
                if((int)PacksCaja2 == 0){
                    Caja2 = 0;
                    PersonasAtendidas = PersonasAtendidas + 1;
                }
            }
//Caja #3 ------------------------------------------------------------------------            

            if(Caja1 == 1 && Caja2 == 1 && Caja3 == 0 && PersonasEnCola > 0){
                PersonasEnCola = PersonasEnCola - 1;
                PacksCaja3 = Math.random()*(15-5)+5;
                Caja3 = 1;    
                System.out.println("La caja #3 atendera " + (int)PacksCaja3 + " Packs de items");
                TotalPacksVendidos = TotalPacksVendidos + (int)PacksCaja3;
            }

            if(Caja3 == 0){
                System.out.println("La caja #3 esta vacia");
            }

            if(Caja3 == 1){             
                PacksCaja3 = PacksCaja3 - 1;
                System.out.println("La caja #3 esta ocupada");
                if((int)PacksCaja3 == 0){
                    Caja3 = 0;
                    PersonasAtendidas = PersonasAtendidas + 1;
                }
            }           
//Caja #4 ------------------------------------------------------------------------            

            if(Caja1 == 1 && Caja2 == 1 && Caja3 == 1 && Caja4 == 0 && PersonasEnCola > 0){
                PersonasEnCola = PersonasEnCola - 1;
                PacksCaja4 = Math.random()*(15-5)+5;
                Caja4 = 1;    
                System.out.println("La caja #4 atendera " + (int)PacksCaja4 + " Packs de items");
                TotalPacksVendidos = TotalPacksVendidos + (int)PacksCaja4;
            }

            if(Caja4 == 0){
                System.out.println("La caja #4 esta vacia");
            }

            if(Caja4 == 1){             
                PacksCaja4 = PacksCaja4 - 1;
                System.out.println("La caja #4 esta ocupada");
                if((int)PacksCaja4 == 0){
                    Caja4 = 0;
                    PersonasAtendidas = PersonasAtendidas + 1;
                }
            }
            
            System.out.println("=======================================================");
        }
//Extensiones ------------------------------------------------------------------------

        System.out.println("La cola estuvo vacia durante: " + TiempoColaVacia + " minutos.");

        System.out.println("Al final del dia habian: " + PersonasEnCola + " Personas en la cola");

        System.out.println("Se atendieron: " + PersonasAtendidas + " Personas");
        
        System.out.println("Se vendieron: " + TotalPacksVendidos + " Packs de items");
    }
}