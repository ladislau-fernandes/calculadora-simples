public class Operacao {
    public double num1;
    public double num2;
    public char operador;


    public Operacao(double num1, double num2, char operador) {
        this.num1 = num1;
        this.num2 = num2;
        this.operador = operador;
    }

        public double calcular() {
            double resultado = 0;

            switch (operador) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    if(num2 == 0) {
                        System.out.println("Não divede por zero");
                        break;
                    }
                    resultado = num1 / num2;
                    break;
                default:
                    System.out.println("Operador inválido!");
                    break;
            }

            return resultado;
        }
    }

