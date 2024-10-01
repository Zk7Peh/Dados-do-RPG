import java.util.*;
public class Jogo_de_RPG {
	public static void main(String[] args) {
		// ===========================================
		// Declaração das Instâncias
		// ===========================================
		Random rd = new Random();
		Scanner ler = new Scanner(System.in);
		// ===========================================
		// Declaração de Variaveis
		// ===========================================
		int id_aventureiro = 0;
		id_aventureiro = rd.nextInt(10000);
		// ===========================================
		String Nome = "";
		// O Nome Será o Nome do Aventureiro
		// ===========================================
		String Raca = "";
		// A Raca Será a Raça do Aventureiro
		// ===========================================
		String Classe = "";
		// Igualmente a cima
		// ===========================================
		String Elemento = "";
		// Igualmente a Cima
		// ===========================================
		Boolean[] Inventario = new Boolean[256];
		// O inventario vai ser de tipo true ou false, se ele tiver algo vai ter a variavel verifica_exemplo, se ela for true adiciona no inventario, talvez eu faça um veficador toda vez que o código se repetir
		// ===========================================
		String[] Inventario_String = new String[256];
		// O inventario vai ser os nomes, se ele tiver algo vai ter a variavel verifica_exemplo, se ela for true adiciona no inventario, talvez eu faça um veficador toda vez que o código se repetir
		// ===========================================
		int Dinheiro = 100;
		// Dinheiro
		// ===========================================
		int Defesa = 10;
		// Defesa Com base nos equipamentos vai adicionar na defesa
		// ===========================================
		int Pocao_Cura = 0;
		// Sei lá que porra é isso
		// ===========================================
		int Vida = 100;
		// Declaração Vida
		// ===========================================
		int Forca = 100;
		// Declaração Vida
		// ===========================================
		int Agilidade = 100;
		// Declaração Vida
		// ===========================================
		int Magia = 100;
		// Declaração Vida
		// ===========================================		
		int Magia_Atual = 100;
		// Declaração magia atual, magia que gasta mana
		// ===========================================		
		int Xp = 0;
		// Sei lá que porra é isso
		// ===========================================		
		int Lvl = 0;
		// Sei lá que porra é isso
		// ===========================================		
		String Nome_Espada_Madeira = "Espada de Madeira";
		Boolean Verifica_Espada_Madeira = false;
		int Dano_Espada_Madeira = 4;
		// Declaração de uma Espada, Sim ficou grande para kct
		// ===========================================
		String Nome_Espada_Pedra = "Espada de Pedra";
		Boolean Verifica_Espada_Pedra = false;
		int Dano_Espada_Pedra = 5;
		// Declaração de uma Espada, Sim ficou grande para kct
		// ===========================================
		String Nome_Espada_Ferro = "Espada de Ferro";
		Boolean Verifica_Espada_Ferro = false;
		int Dano_Espada_Ferro = 6;
		// Declaração de uma Espada, Sim ficou grande para kct
		// ===========================================
		String Nome_Espada_Diamante = "Espada de Diamante";
		Boolean Verifica_Espada_Diamante = false;
		int Dano_Espada_Diamante = 7;
		// Declaração de uma Espada, Sim ficou grande para kct
		// ===========================================
		String Nome_Espada_Ruby = "Espada de Ruby";
		Boolean Verifica_Espada_Ruby = false;
		int Dano_Espada_Ruby = 9;
		// Declaração de uma Espada, Sim ficou grande para kct
		// ===========================================
		String[] Magia_Fogo = new String[3];
		int[] Magia_Fogo_Dano = new int[3];
		int[] Gasto_Magia_Fogo = new int[3];
		// Declaração das magias, Os Danos vai ser adicionado a cada tipo de magia
		// Pequena = 5 Dano = 50 Mana
		// Média = 7 Dano = 100 Mana
		// Grande = 10 Dano = 200 Mana
		// ===========================================
		String[] Magia_Agua = new String[3];
		int[] Magia_Agua_Dano = new int[3];
		int[] Gasto_Magia_Agua = new int[3];
		// Declaração das magias, Os Danos vai ser adicionado a cada tipo de magia
		// Pequena = 5 Dano = 50 Mana
		// Média = 7 Dano = 100 Mana
		// Grande = 10 Dano = 200 Mana
		// ===========================================
		String[] Magia_Terra = new String[3];
		int[] Magia_Terra_Dano = new int[3];
		int[] Gasto_Magia_Terra = new int[3];
		// Declaração das magias, Os Danos vai ser adicionado a cada tipo de magia
		// Pequena = 5 Dano = 50 Mana
		// Média = 7 Dano = 100 Mana
		// Grande = 10 Dano = 200 Mana
		// ===========================================
		String[] Magia_Ar = new String[3];
		int[] Magia_Ar_Dano = new int[3];
		int[] Gasto_Magia_Ar = new int[3];
		// Declaração das magias, Os Danos vai ser adicionado a cada tipo de magia
		// Pequena = 5 Dano = 50 Mana
		// Média = 7 Dano = 100 Mana
		// Grande = 10 Dano = 200 Mana
		// ===========================================
		String[] Magia_Sombra = new String[3];
		int[] Magia_Sombra_Dano = new int[3];
		int[] Gasto_Magia_Sombra = new int[3];
		// Declaração das magias, Os Danos vai ser adicionado a cada tipo de magia
		// Pequena = 5 Dano = 50 Mana
		// Média = 7 Dano = 100 Mana
		// Grande = 10 Dano = 200 Mana
		// ===========================================
		String[] Magia_Luz = new String[3];
		int[] Magia_Luz_Dano = new int[3];
		int[] Gasto_Magia_Luz = new int[3];
		// Declaração das magias, Os Danos vai ser adicionado a cada tipo de magia
		// Pequena = 5 Dano = 50 Mana
		// Média = 7 Dano = 100 Mana
		// Grande = 10 Dano = 200 Mana
		// ===========================================
		String[] Magia_Sangue = new String[3];
		int[] Magia_Sangue_Dano = new int[3];
		int[] Gasto_Magia_Sangue = new int[3];
		// Declaração das magias, Os Danos vai ser adicionado a cada tipo de magia
		// Pequena = 5 Dano = 50 Mana
		// Média = 7 Dano = 100 Mana
		// Grande = 10 Dano = 200 Mana
		// ===========================================
		String var1 = "";
		String var2 = "";
		String var3 = "";
		String tam1 = "";
		String tam2 = "";
		String tam3 = "";
		int dano5 = 5;
		int dano7 = 7;
		int dano10 = 10;
		// Isso é pros elemento ignora
		// ===========================================
		imprime_linha();
		System.out.println("Jogo de RPG - Desenvolvido Por Peh, Discord: zk7_peh");
		imprime_linha();
		System.out.println("ATENÇÃO!!!! TUDO QUE FORES DIGITAR");
		System.out.println("DIGITAR SEM ACENTOS!");
		System.out.println("Digite Sem Acento para o Programa Reconhecer!");
		imprime_linha();
		try {
		    Thread.sleep(2000); // pause for 2 second
		} catch (InterruptedException e) {
		    Thread.currentThread().interrupt();
		}
		System.out.println("Racas:");
		System.out.println("Humano / Anjo / Gigante / Demonio / Anjo Caido / Elfo");
		imprime_linha();
		System.out.println("Classes:");
		System.out.println("Mago / Guerreiro / Arqueiro / Lutador");
		imprime_linha();
		System.out.println("Elementos:");	
		System.out.println("Fogo / Agua / Terra / Ar / Sombra / Luz/ Sangue /");
		imprime_linha();
		// ===========================================
		System.out.println("Digite Seu Nome, Aventureiro!");
		Nome = ler.nextLine();
		imprime_linha();
		// ===========================================
		System.out.println("Digite Sua Raça!");
		Raca = ler.nextLine();
		imprime_linha();
		// ===========================================
		System.out.println("Digite Sua Classe!");
		Classe = ler.nextLine();
		imprime_linha();
		// ===========================================
		System.out.println("Digite Seu Elemento!");
		Elemento = ler.nextLine();
		imprime_linha();
		// ===========================================
		switch(Raca) {
			case "Humano":
				Vida = Vida + 110;
				Forca = Forca + 110;
				Agilidade = Agilidade + 50;
				break;
				
			case "Anjo Caido":
				Vida = Vida + 120;
				Forca = Forca + 120;
				Agilidade = Agilidade + 60;
				break;
				
			case "Anjo":
				Vida = Vida + 150;
				Forca = Forca + 150;
				Agilidade = Agilidade + 50;
				Magia = Magia + 150;
				break;

			case "ABU":
				Vida = Vida + 11000;
				Forca = Forca + 10010;
				Agilidade = Agilidade + 5000;
				break;

			case "Demonio":
				Vida = Vida + 135;
				Forca = Forca + 135;
				Agilidade = Agilidade + 40;
				break;

			case "Elfo":
				Vida = Vida + 75;
				Forca = Forca + 75;
				Agilidade = Agilidade + 110;
				break;

			case "Gigante":
				Vida = Vida + 200;
				Forca = Forca + 200;
				Agilidade = Agilidade + 35;
				break;
		}
		switch(Classe) {
			case "Mago":
				Vida = Vida + 110;
				Forca = Forca + 110;
				Agilidade =Agilidade + 50;
				imprime_linha();
				System.out.println("Sua Magia, Qual O Tamanho?");
				imprime_linha();
				System.out.println("Pequena = 5 de Dano / 75 de Mana Gasta");
				System.out.println("Media = 7 de Dano / 100 de Mana Gasta");
				System.out.println("Grande = 10 de Dano / 150 de Mana");
				imprime_linha();
				// ===========================================
				System.out.println("Digite O Nome da Sua Primeira Mágia:");
				var1 = ler.nextLine();
				// ===========================================
				System.out.println("Qual o Tamanho da Sua Magia?");
				tam1 = ler.nextLine();
				// ===========================================
				System.out.println("Digite Um Outro Nome da Sua Primeira Mágia:");
				var2 = ler.nextLine();
				// ===========================================
				System.out.println("Qual o Tamanho da Sua Magia?");
				tam2 = ler.nextLine();
				// ===========================================
				System.out.println("Digite Um Outro Nome da Sua Primeira Mágia:");
				var3 = ler.nextLine();	
				// ===========================================
				System.out.println("Qual o Tamanho da Sua Magia?");
				tam3 = ler.nextLine();
				// ===========================================
				switch(Elemento) {
					case "Fogo":
						Magia_Fogo[0] = var1;
						Magia_Fogo[1] = var2;
						Magia_Fogo[2] = var3;
						
						if (tam1 == "Pequena") {
							Gasto_Magia_Fogo[0] = 50;
							Magia_Fogo_Dano[0] = dano5;
						}
						else if (tam1 == "Media") {
							Gasto_Magia_Fogo[0] = 100;
							Magia_Fogo_Dano[0] = 7;
						}
						else if (tam1 == "Grande") {
							Gasto_Magia_Fogo[0] = 200;
							Magia_Fogo_Dano[0] = 10;
						}
						
						if (tam2 == "Pequena") {
							Gasto_Magia_Fogo[1] = 50;
							Magia_Fogo_Dano[1] = 5;
						}
						else if (tam2 == "Media") {
							Gasto_Magia_Fogo[1] = 100;
							Magia_Fogo_Dano[1] = 7;
						}
						else if (tam2 == "Grande") {
							Gasto_Magia_Fogo[1] = 200;
							Magia_Fogo_Dano[1] = 10;
						}
						if (tam3 == "Pequena") {
							Gasto_Magia_Fogo[2] = 50;
							Magia_Fogo_Dano[2] = 5;
						}
						else if (tam3 == "Media") {
							Gasto_Magia_Fogo[2] = 100;
							Magia_Fogo_Dano[2] = 7;
						}
						else if (tam3 == "Grande") {
							Gasto_Magia_Fogo[2] = 200;
							Magia_Fogo_Dano[2] = 10;
						}
						imprime_linha();
						System.out.println("Aqui Está Os Dados da Sua Magia!");
						imprime_linha();
						System.out.println("Nome da Magia");
						System.out.println(Magia_Fogo[0]);
						System.out.println("Dano da Magia");
						System.out.println(Magia_Fogo_Dano[0]);
						System.out.println("Gasto da Magia");
						System.out.println(Gasto_Magia_Fogo[0]);
						imprime_linha();
						System.out.println("Nome da Magia");
						System.out.println(Magia_Fogo[1]);
						System.out.println("Dano da Magia");
						System.out.println(Magia_Fogo_Dano[1]);
						System.out.println("Gasto da Magia");
						System.out.println(Gasto_Magia_Fogo[1]);
						imprime_linha();
						System.out.println("Nome da Magia");
						System.out.println(Magia_Fogo[2]);
						System.out.println("Dano da Magia");
						System.out.println(Magia_Fogo_Dano[2]);
						System.out.println("Gasto da Magia");
						System.out.println(Gasto_Magia_Fogo[2]);
						imprime_linha();
						break;
					case "Agua":
						Magia_Agua[1] = var1;
						Magia_Agua[2] = var2;
						Magia_Agua[3] = var3;
						if (tam1 == "Pequena") {
							Gasto_Magia_Agua[0] = 50;
							Magia_Agua_Dano[0] = 5;
						}
						else if (tam1 == "Media") {
							Gasto_Magia_Agua[0] = 100;
							Magia_Agua_Dano[0] = 7;
						}
						else if (tam1 == "Grande") {
							Gasto_Magia_Agua[0] = 200;
							Magia_Agua_Dano[0] = 10;

						}
						
						if (tam2 == "Pequena") {
							Gasto_Magia_Agua[1] = 50;
							Magia_Agua_Dano[1] = 5;

						}
						else if (tam2 == "Media") {
							Gasto_Magia_Agua[1] = 100;
							Magia_Agua_Dano[1] = 7;

						}
						else if (tam2 == "Grande") {
							Gasto_Magia_Agua[1] = 200;
							Magia_Agua_Dano[1] = 10;

						}
						if (tam3 == "Pequena") {
							Gasto_Magia_Agua[2] = 50;
							Magia_Agua_Dano[2] = 5;
						}
						else if (tam3 == "Media") {
							Gasto_Magia_Agua[2] = 100;
							Magia_Agua_Dano[2] = 7;
						}
						else if (tam3 == "Grande") {
							Gasto_Magia_Agua[2] = 200;
							Magia_Agua_Dano[2] = 10;
						}
						break;
					case "Terra":
						if (tam1 == "Pequena") {
							Gasto_Magia_Terra[0] = 50;
							Magia_Terra_Dano[0] = 5;
						}
						else if (tam1 == "Media") {
							Gasto_Magia_Terra[0] = 100;
							Magia_Terra_Dano[0] = 7;						}
						else if (tam1 == "Grande") {
							Gasto_Magia_Terra[0] = 200;
							Magia_Terra_Dano[0] = 10;
						}
						
						if (tam2 == "Pequena") {
							Gasto_Magia_Terra[1] = 50;
							Magia_Terra_Dano[1] = 5;
						}
						else if (tam2 == "Media") {
							Gasto_Magia_Terra[1] = 100;
							Magia_Terra_Dano[1] = 7;
						}
						else if (tam2 == "Grande") {
							Gasto_Magia_Terra[1] = 200;
							Magia_Terra_Dano[1] = 10;
						}
						if (tam3 == "Pequena") {
							Gasto_Magia_Terra[2] = 50;
							Magia_Terra_Dano[2] = 5;
						}
						else if (tam3 == "Media") {
							Gasto_Magia_Terra[2] = 100;
							Magia_Terra_Dano[2] = 7;
						}
						else if (tam3 == "Grande") {
							Gasto_Magia_Terra[2] = 200;
							Magia_Terra_Dano[2] = 10;
						}
						break;
					case "Ar":
						Magia_Ar[1] = var1;
						Magia_Ar[2] = var2;
						Magia_Ar[3] = var3;
						if (tam1 == "Pequena") {
							Gasto_Magia_Ar[0] = 50;
							Magia_Ar_Dano[0] = 5;
						}
						else if (tam1 == "Media") {
							Gasto_Magia_Ar[0] = 100;
							Magia_Ar_Dano[0] = 7;
						}
						else if (tam1 == "Grande") {
							Gasto_Magia_Ar[0] = 200;
							Magia_Ar_Dano[0] = 10;

						}
						
						if (tam2 == "Pequena") {
							Gasto_Magia_Ar[1] = 50;
							Magia_Ar_Dano[1] = 5;
						}
						else if (tam2 == "Media") {
							Gasto_Magia_Ar[1] = 100;
							Magia_Ar_Dano[1] = 7;

						}
						else if (tam2 == "Grande") {
							Gasto_Magia_Ar[1] = 200;
							Magia_Ar_Dano[1] = 10;
						}
						if (tam3 == "Pequena") {
							Gasto_Magia_Ar[2] = 50;
							Magia_Ar_Dano[2] = 5;
						}
						else if (tam3 == "Media") {
							Gasto_Magia_Ar[2] = 100;
							Magia_Ar_Dano[2] = 7;
						}
						else if (tam3 == "Grande") {
							Gasto_Magia_Ar[2] = 200;
							Magia_Ar_Dano[2] = 10;
						}
						break;
					case "Sombra":
						Magia_Sombra[1] = var1;
						Magia_Sombra[2] = var2;
						Magia_Sombra[3] = var3;
						if (tam1 == "Pequena") {
							Gasto_Magia_Sombra[0] = 50;
							Magia_Sombra_Dano[0] = 5;
						}
						else if (tam1 == "Media") {
							Gasto_Magia_Sombra[0] = 100;
							Magia_Sombra_Dano[0] = 7;
						}
						else if (tam1 == "Grande") {
							Gasto_Magia_Sombra[0] = 200;
							Magia_Sombra_Dano[0] = 10;
						}
						
						if (tam2 == "Pequena") {
							Gasto_Magia_Sombra[1] = 50;
							Magia_Sombra_Dano[1] = 5;
						}
						else if (tam2 == "Media") {
							Gasto_Magia_Sombra[1] = 100;
							Magia_Sombra_Dano[1] = 7;
						}
						else if (tam2 == "Grande") {
							Gasto_Magia_Sombra[1] = 200;
							Magia_Sombra_Dano[1] = 10;
						}
						if (tam3 == "Pequena") {
							Gasto_Magia_Sombra[2] = 50;
							Magia_Sombra_Dano[2] = 5;
						}
						else if (tam3 == "Media") {
							Gasto_Magia_Sombra[2] = 100;
							Magia_Sombra_Dano[2] = 7;
						}
						else if (tam3 == "Grande") {
							Gasto_Magia_Sombra[2] = 200;
							Magia_Sombra_Dano[2] = 10;
						}
						break;
					case "Luz":
						Magia_Luz[1] = var1;
						Magia_Luz[2] = var2;
						Magia_Luz[3] = var3;
						if (tam1 == "Pequena") {
							Gasto_Magia_Luz[0] = 50;
							Magia_Luz_Dano[0] = 5;
						}
						else if (tam1 == "Media") {
							Gasto_Magia_Luz[0] = 100;
							Magia_Luz_Dano[0] = 7;
						}
						else if (tam1 == "Grande") {
							Gasto_Magia_Luz[0] = 200;
							Magia_Luz_Dano[0] = 10;
						}
						
						if (tam2 == "Pequena") {
							Gasto_Magia_Luz[1] = 50;
							Magia_Luz_Dano[1] = 5;
						}
						else if (tam2 == "Media") {
							Gasto_Magia_Luz[1] = 100;
							Magia_Luz_Dano[1] = 7;
						}
						else if (tam2 == "Grande") {
							Gasto_Magia_Luz[1] = 200;
							Magia_Luz_Dano[1] = 10;
						}
						if (tam3 == "Pequena") {
							Gasto_Magia_Luz[2] = 50;
							Magia_Luz_Dano[2] = 5;
						}
						else if (tam3 == "Media") {
							Gasto_Magia_Luz[2] = 100;
							Magia_Luz_Dano[2] = 7;
						}
						else if (tam3 == "Grande") {
							Gasto_Magia_Luz[2] = 200;
							Magia_Luz_Dano[2] = 10;
						}
						break;
					case "Sangue":
						Magia_Sangue[1] = var1;
						Magia_Sangue[2] = var2;
						Magia_Sangue[3] = var3;
						if (tam1 == "Pequena") {
							Gasto_Magia_Sangue[0] = 50;
							Magia_Sangue_Dano[0] = 5;
						}
						else if (tam1 == "Media") {
							Gasto_Magia_Sangue[0] = 100;
							Magia_Sangue_Dano[0] = 7;
						}
						else if (tam1 == "Grande") {
							Gasto_Magia_Sangue[0] = 200;
							Magia_Sangue_Dano[0] = 5;
						}
						if (tam2 == "Pequena") {
							Gasto_Magia_Sangue[1] = 50;
							Magia_Sangue_Dano[1] = 7;
						}
						else if (tam2 == "Media") {
							Gasto_Magia_Sangue[1] = 100;
							Magia_Sangue_Dano[1] = 10;
						}
						else if (tam2 == "Grande") {
							Gasto_Magia_Sangue[1] = 200;
							Magia_Sangue_Dano[1] = 5;
						}
						if (tam3 == "Pequena") {
							Gasto_Magia_Sangue[2] = 50;
							Magia_Sangue_Dano[2] = 5;
						}
						else if (tam3 == "Media") {
							Gasto_Magia_Sangue[2] = 100;
							Magia_Sangue_Dano[2] = 7;
						}
						else if (tam3 == "Grande") {
							Gasto_Magia_Sangue[2] = 200;
							Magia_Sangue_Dano[2] = 10;
						}
						break;
				}
				break;
			case "Guerreiro":
				Vida = Vida + 75;
				Forca = Forca + 75;
				Agilidade = Agilidade + 75;
				break;
			
			case "Arqueiro":
				Vida = Vida + 55;
				Forca = Forca + 55;
				Agilidade = Agilidade + 95;
				break;
				
			case "Lutador":
				Vida = Vida + 75;
				Forca = Forca + 90;
				Agilidade = Agilidade + 50;
				break;
			
		}
			print("{System}: Como Foi Sua Vida?");
			print("{System}: Triste");
			print("{System}: Feliz");
			print("{System}: Culposa");
			print("{System}: Orgulhosa");
			print("{System}: Envergonhosa");
			print("{System}: Sozinha");

	}
	public static void imprime_linha() {
		System.out.println("==============!==============");
	}
	public static void print(String msg) {
		System.out.println(msg);
	}
}
