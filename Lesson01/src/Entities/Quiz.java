package Entities;

public class Quiz {
	private String name;
	private String answers;
	
	public Quiz() {
		
	}

	public Quiz(String name, String answers) {
		this.name = name;
		this.answers = answers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getAnswers() {
		return answers;
	}
			
	public String questionPortuguese(int i) {
		String [] questions = new String[10];
		questions[0] = "De quem é a famosa frase “Penso, logo existo”?\n"
				+ "(a)Platão (b)Galileu Galilei (c)Descartes (d)Sócrates"; 
		questions[1] = "De onde é a invenção do chuveiro elétrico? \n"
				+ "(a)França (b)Inglaterra (c)Brasil (d)EUA";
		questions[2] = "Quais o menor e o maior país do mundo? \n" 
				+ "(a)Vaticano e Russia (b)Nauru e China (c)Mônaco e Canada (d)Malta e EUA";
		questions[3] = "Qual o nome do presidente do Brasil que ficou conhecido como Jango?\n" 
				+ "(a)Jânio Quadros (b)João Figueiredo (c)Getúlio Vargas (d)João Goulart";
		questions[4] = "Qual o número mínimo de jogadores numa partida de futebol?\n" 
				+ "(a)7 (b)8 (c)11 (d)9";
		questions[5] = "Qual o livro mais vendido no mundo a seguir à Bíblia?\n"
				+ "(a)O senhor dos Anéis (b)Dom quixote (c)O pequeno principe (d)Um conto de duas cidades";
		questions[6] = "Quantas casas decimais tem o número pi?\n"
				+ "(a)duas (b)centenas (c)infinitas (d)vinte";
		questions[7] = "Atualmente, quantos elementos químicos a tabela periódica possui?\n" 
				+ "(a)113 (b)109 (c)108 (d)118";
		questions[8] = "Quanto tempo a luz do Sol demora para chegar à Terra?\n"
				+ "(a)12 minutos (b)7 minutos (c)5 minutos (d) 8 minutos";
		questions[9] = "O que a palavra legend significa em português?\n" 
				+ "(a)Legenda (b)Conto (c)Lenda (d) Legendário";
		
		return questions[i];
		
	}
	
	public String questionEnglish(int i) {
		String [] questions = new String[10];
		questions[0] = "Entomology is the science that studies”?\n"
				+ "(a)Behavior  (b)Insects (c)The origin and history of technical and scientific terms (d)The formation of rocks"; 
		questions[1] = "Eritrea, which became the 182nd member of the UN in 1993, is in the continent of\n"
				+ "(a)Asia (b)Africa (c)Europe (d)Australia";
		questions[2] = "For which of the following disciplines is Nobel Prize awarded?\n" 
				+ "(a)Physics and Chemistry (b)Physiology or Medicine (c)Literature, Peace and Economics (d)All of the above";
		questions[3] = "Hitler party which came into power in 1933 is known as\n" 
				+ "(a)Labour Party (b)Nazi Party (c)Ku-Klux-Klan (d)Democratic Party";
		questions[4] = "Fastest shorthand writer was\n" 
				+ "(a)Dr. G. D. Bist (b)J.R.D. Tata (c)J.M. Tagore (d)Khudada Khan";
		questions[5] = "Epsom (England) is the place associated with\n"
				+ "(a)Horse racing (b)Polo (c)Shooting (d)Snooker";
		questions[6] = "First human heart transplant operation conducted by Dr. Christiaan Barnard on Louis Washkansky, was conducted in\n"
				+ "(a)1967 (b)1968 (c)1958 (d)1922";
		questions[7] = "Galileo was an Italian astronomer who\n" 
				+ "(a)developed the telescope (b)discovered four satellites of Jupiter (c)discovered that the movement of pendulum produces a regular time measurement (d)All of the above";
		questions[8] = "First Afghan War took place in\n"
				+ "(a)1839 (b)1843 (c)1833 (d)1848 ";
		questions[9] = "First China War was fought between\n" 
				+ "(a)China and Britain (b)China and France (c)China and Egypt (d)China and Greek ";
		
		return questions[i];
	}
	
	public String ansPortuguese(int i) {
	String [] ans = new String[10];
		
		ans[0] = "c"; 
		ans[1] = "c";
		ans[2] = "a";
		ans[3] = "d";
		ans[4] = "a";
		ans[5] = "b";
		ans[6] = "c";
		ans[7] = "d";
		ans[8] = "d";
		ans[9] = "c";
		return ans[i];
	}
	
	public String ansEnglish(int i) {
		String [] ans = new String[10];
			
			ans[0] = "b"; 
			ans[1] = "b";
			ans[2] = "d";
			ans[3] = "b";
			ans[4] = "a";
			ans[5] = "a";
			ans[6] = "a";
			ans[7] = "d";
			ans[8] = "a";
			ans[9] = "a";
			return ans[i];
		}
}
