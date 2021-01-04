public class aula18ex
{
	public static void main(String[] args) {
        String meuNome = "Lucas Silva";
		int minhaIdade = 40;
        double meuPeso = 90;
        double altura = 2.10;
        String profissao = "músico";
		boolean isLegal = true;
        char gênero = 'm';

        System.out.println("O nome é" + meuNome);
		System.out.println("A idade " + minhaIdade);
        System.out.println("O peso é " + meuPeso);
        System.out.println("A Altura é " + altura);
        System.out.println("A profissão é " + profissao);
		System.out.println("É legal? " + isLegal);
        System.out.println("O gênero é " + gênero);
        
        int idadeDias = minhaIdade*365;
        int idadeHoras = idadeDias*24;
        int idadeMinutos = idadeHoras*60;
        int idadeSegundos = idadeMinutos*60;

        System.out.println("A sua idade em dias: "+idadeDias+", em horas "+idadeHoras+", em minutos "
        + idadeMinutos+", em segundos "+idadeSegundos);
        
		
        
    }
}