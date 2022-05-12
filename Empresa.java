public class Empresa {
    private String nome;
    private double salario;
    private String RF;

    public Empresa(String nome, double salario, String RF) {
        this.nome = nome;
        this.salario = salario;
        this.RF = RF;
    }

    public void aumentarSalario(int porcentagem) {
        salario += salario * porcentagem / 100;
    }

    public String toString() {
        return nome + " " + salario;
    }

    public class Gerente extends Empresa{  
        private String departamento;

        public Gerente (String nome, double salario, String departamento){
            super(nome, salario, RF);
            this.departamento = departamento;
        }      

        @Override
        public String toString(){
            return super.toString() + " " + departamento;
        }

        @Override
        public void aumentarSalario(int porcentgem){
            super.aumentarSalario(porcentgem + 20);
        }


        public class Vendedor extends Empresa{
        private  double comissao;

        public Vendedor(String nome, double salario, double comissao){
            super(nome, salario, RF);
            this.comissao=comissao;}

            @Override
            public String toString(){
                return super.toString() + " " + comissao;
            }

            @Override
            public void aumentarSalario(int porcentgem){
                super.aumentarSalario(porcentgem + 20);
            }
        }

    }



    public static void main(String[] args) {

        Empresa funcionario = new Empresa("Alberto", 1500, "RF:0001");
        System.out.println(funcionario.toString());
        funcionario.aumentarSalario(100);
        System.out.println(funcionario.toString());
        System.out.println(funcionario.RF);

        Empresa gerente = new Empresa("Joao", 17000, "RF:0002");
        System.out.println(gerente.toString());
        gerente.aumentarSalario(50);
        System.out.println(gerente.toString());
        System.out.println(gerente.RF);

        Empresa vendedor = new Empresa("Cleyton", 1200, "RF:0003");
        System.out.println(vendedor.toString());
        vendedor.aumentarSalario(70);
        System.out.println(vendedor.toString());
        System.out.println(vendedor.RF);

    }
}