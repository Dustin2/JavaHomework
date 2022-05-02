package bancos;

//class father
import java.util.Scanner;

public abstract class Cuentas extends Bancos {
    protected static double Saldo;
    protected static String NombreCliente;
    protected static int NumCuenta;

    public static Scanner leer = new Scanner(System.in);
    // atributos accesibles solo por los metodos

    public Cuentas() {
    }

    public Cuentas(int NumCuenta, float Saldo, String NombreCliente, int NC) {
        this.Saldo = Saldo;
        this.NombreCliente = NombreCliente;
        this.NumCuenta = NumCuenta;
        this.NC = NC;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public int getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(int NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

    public void PedirDatos() {
        System.out.println("Registrar cuenta bancaria");
        System.out.print("Ingrese su nombre: ");
        NCuentas[NC].setNombreCliente(leer.next());
        System.out.print("Ingrese su numero de cuenta bancaria: ");
        NCuentas[NC].setNumCuenta(leer.nextInt());
        System.out.print("Ingrese su saldo inicial: ");
        this.Saldo = Cuentas.leer.nextFloat();

    }

    abstract public void RetirarSaldo();

    public void DepositarSaldo() {
        float Deposito;
        String buscar, Cliente, NumeroDeCuenta;
        System.out.print("Ingresa el nombre del cliente o numero de cuenta bancaria a depositar: ");
        buscar = leer.next();
        Cliente = NombreCliente;
        NumeroDeCuenta = String.valueOf(NumCuenta);
        if (Cliente.equals(buscar) || NumeroDeCuenta.equals(buscar)) {
            System.out.print("Ingresa la cantidad a depositar: ");
            Deposito = leer.nextFloat();
            Saldo = Saldo + Deposito;
            if (Deposito <= 0) {
                System.out.println("Ingrese una cantidad valida a depositar: ");
            } else {
                System.out.println("Depósito realizado con exito, su saldo actual es: " + " $" + Saldo);
            }
        } else {
            System.out.println("Usuario no encontrado");
        }
    }

    public void ConsultarDatos() {
        String buscar, Cliente, NumeroDeCuenta;
       
        Cliente = NombreCliente;
        NumeroDeCuenta = String.valueOf(NumCuenta);
        System.out.print("\nIngresa el nombre o numero de cuenta del usuario a buscar: ");
        buscar = leer.next();
        do {

        
       for (int i = 0; i < NC; i++) {
        
        if (Cliente.equals(buscar) || NumeroDeCuenta.equals(buscar)) { 
            System.out.println("Nombre de cuenta"+NCuentas[(i)].getNombreCliente());
            System.out.println("Numero de cuenta"+NCuentas[i].getNumCuenta());
            System.out.println("Saldo : $"+NCuentas[i].getSaldo());
            
           
            //System.out.println(NCuentas[i].g);
            
           break;
        }else{
            System.out.println("Error");
        }
    
       }
           
            
           
            
        } while(Cliente == buscar);

    
    
    }
}
