import time
import random
import sqlite3

def RolaDado(b):
    b=random.randint(1,20)
def Usar_Pocao():
    if pocao_cura in inventario:
        vida_atual = vida

print("━━━━━━━━━━━━━━ ⟡ ━━━━━━━━━━━━━━")
print("JOGO RPG")
print("━━━━━━━━━━━━━━ ⟡ ━━━━━━━━━━━━━━")
print("Raças:")
print("Humano / Anjo / Gigante / Demonio / Anjo Caido / Elfo")
print("━━━━━━━━━━━━━━ ⟡ ━━━━━━━━━━━━━━")
print("Classes:")
print("Mago / Guerreiro / Arqueiro / Lutador")
print("━━━━━━━━━━━━━━ ⟡ ━━━━━━━━━━━━━━")
print("Elementos:")
print("Fogo / Água / Terra / Ar / Sombra / Luz/ Sangue /")
print("━━━━━━━━━━━━━━ ⟡━━━━━━━ ━━━━━━━")
id_user = random.randint(1,10000)
nome=input("Qual Seu Nome\n")
raca=input("Qual Sua Raça?\n")
classe=input("Qual Sua Classe?\n")
elemento=input("Qual Seu Elemento?\n")
inventario=[]
dinheiro = 200
defesa = 10
pocao_cura = 0

#=======================
espada_madeira=["Espada De Madeira", 4]
verifica_espada_madeira = False
espada_ferro=["Espada de Ferro", 6]
verifica_espada_madeira = False
espada_pedra=["Espada de Pedra", 5]
verifica_espada_madeira = False
espada_diamante=["Espada de Diamante", 7]
espada_ruby=["Espada de Ruby", 9]
#=======================
flecha_madeira=["Flecha De Madeira", 4]
flecha_ferro=["Flecha de Ferro", 6]
flecha_pedra=["Flecha de Pedra", 5]
flecha_diamante=["Flecha de Diamante", 7]
flecha_ruby=["Flecha de Ruby", 9]
#=======================
machado_madeira=["Flecha De Madeira", 5]
machado_ferro=["Flecha de Ferro", 7]
machado_pedra=["Flecha de Pedra", 6]
machado_diamante=["Flecha de Diamante", 9]
machado_ruby=["Flecha de Ruby", 10]


magia_fogo=[]
magia_agua=[]
magia_terra=[]
magia_ar=[]
magia_sombra=[]
magia_luz=[]
magia_sangue=[]

vida=100
forca=100
agilidade=100
magia=100
xp=0
lvl = 0

if raca == "Humano":
    vida += 110
    forca += 110
    agilidade += 50

elif raca == "Anjo Caido":
    vida += 110
    forca += 110
    agilidade += 50   

elif raca == "Anjo":
    vida += 150
    forca += 150
    agilidade += 150
    magia += 150
    inventario.append(flecha_ferro)

elif raca == "ABU":
    vida += 99999
    forca += 99999
    agilidade += 99999
    magia += 99999

elif raca == "Demonio":
    vida += 150
    forca += 150
    agilidade += 150

elif raca == "Elfo":
    vida += 75
    forca += 75
    agilidade += 150
    magia += 50

elif raca == "Gigante":
    vida += 200
    forca += 200
    agilidade -= 50

if classe == "Guerreiro":

    vida += 50
    forca += 50
    agilidade += 50
    inventario.append(espada_pedra)

elif classe == "Mago":
    vida += 50
    forca += 50
    agilidade += 100
    print("Digite 3 Nomes Para Sua Magia:")
    var1=input("Digite o Nome:")
    var2=input("Digite o Nome:")
    var3=input("Digite o Nome:")

    if elemento == "Fogo":
        magia_fogo.append(var1)
        magia_fogo.append(var2)
        magia_fogo.append(var3)
        print(magia_fogo)

    if elemento == "Água":
        magia_agua.append(var1)
        magia_agua.append(var2)
        magia_agua.append(var3)
        print(magia_agua)

    if elemento == "Terra":
        magia_terra.append(var1)
        magia_terra.append(var2)
        magia_terra.append(var3)
        print(magia_terra)

    if elemento == "Ar":
        magia_ar.append(var1)
        magia_ar.append(var2)
        magia_ar.append(var3)
        print(magia_ar)

    if elemento == "Sombra":
        magia_sombra.append(var1)
        magia_sombra.append(var2)
        magia_sombra.append(var3)
        print(magia_sombra)
        
    if elemento == "Luz":
        magia_luz.append(var1)
        magia_luz.append(var2)
        magia_luz.append(var3)
        print(magia_luz)
        
    if elemento == "Sangue":
        magia_sangue.append(var1)
        magia_sangue.append(var2)
        magia_sangue.append(var3)
        print(magia_sangue)
        
elif classe == "Arqueiro":
    vida += 50
    forca += 50
    agilidade += 50
    inventario.append(flecha_madeira)

elif classe == "Lutador":
    vida += 75
    forca += 75
    agilidade += 75

print("Me Diga, Usuário, como Foi a História do Seu Personagem?")
print("Triste")
print("Feliz")
print("Culposa")
print("Orgulhosa")
print("Envergonhosa")
print("Sozinha")

his=input("Escreva Como Foi:\n")

if his == "Triste":
    print("Sua Infância foi Trágica, Marcada Por Mortes... Ou Até Machucados e Cicatrizes Impágaveis")
    print("Você Recebeu + 50 de Cada Atributo, Menos Magia")
    vida += 50
    forca += 50
    agilidade += 50

if his == "Feliz":
    print("Sua Infância Foi Marcada Por Ser Extremamente Boa, Seja Com Boas Memórias ou Até Com Ótimos Parentes")
    print("Você Foi Treinado Por Algum Parente, E Recebeu + 30 de Todos Os Atributos")    
    vida += 30
    forca += 30
    agilidade += 30
    magia += 30

time.sleep(2)

print(nome + " Após sua infância, você saiu de sua casa em busca de aventuras, saindo de sua vila natal e indo para outro vilarejo")
print("Chegando No Vilarejo, você vê uma grande e imponente guilda, marcada por vários aventureiros")
print("É aqui Que Sua História Começa!")

time.sleep(1)

vida_atual = vida
print("━━━━━━━━━━━━━━ ⟡ ━━━━━━━━━━━━━━") 
print("Ajuda: Toda Arma ou Flecha tem Descrito do que e feito, e logo Após: [Flecha Madeira, 5]<- 5 É O Dano")
print("Sua Vida é:" + str(vida))
print("Sua Força é:" + str(forca))
print("Sua Agilidade é:" + str(agilidade))
print("Sua Magia é" + str(magia))
print("━━━━━━━━━━━━━━ ⟡ ━━━━━━━━━━━━━━") 
print("Seu ID De Aventureiro é:" + str(id_user))
print("Sua Vida Atual é:" + str(vida_atual))
print("Seu Dinheiro Inicial é:" + str(dinheiro))
print("Seu Inventário Inicial é:" + str(inventario))
print("━━━━━━━━━━━━━━ ⟡ ━━━━━━━━━━━━━━")
print("Se você usar uma poção de cura sem tiver uma poção no inventario o codigo buga")
print("━━━━━━━━━━━━━━ ⟡ ━━━━━━━━━━━━━━")

while vida < 100000000000000000000000000000000000:
    
    print("━━━━━━━━━━━━━━ ⟡ ━━━━━━━━━━━━━━")    
    print("O que Você Faz?")
    print("Lutar")
    print("Treinar")
    print("Status")
    print("Explorar")
    print("Reinos - Vai até Um Reino")
    print("━━━━━━━━━━━━━━ ⟡ ━━━━━━━━━━━━━━")
    
    fazer=input("O Que Você Deseja Fazer:\n")

    if fazer == "Reinos":
        print("━━━━━━━━━━━━━━ ⟡ ━━━━━━━━━━━━━━")
        print("Qual Reino Você Deseja Ir?")
        print("Reino de Afrodite - Reino das Magias")
        print("|> Digite (Afrodite)")
        print("━━━━━━━━━━━━━━ ⟡ ━━━━━━━━━━━━━━")
        print("Reino de Durkhein - Reino de Batalha")
        print("|> Digite (Durkhein)")
        print("━━━━━━━━━━━━━━ ⟡ ━━━━━━━━━━━━━━")
        print("Reino de Sonorium - Reino da Mercadoria")
        print("|> Digite (Sonorium)")
        print("━━━━━━━━━━━━━━ ⟡ ━━━━━━━━━━━━━━")

        abuu = input("Qual Reino?")

        if abuu == "Sonorium":
            ve=input("Você Se Vê No Reino de Sonorium, Para Onde Vais?")

            if ve == "Mercado":
                print("Espada Madeira = 50")
                print("Espada Ferro = 200")
                print("Espada Pedra = 100")
                print("Espada Diamante = 500")
                print("Espada Ruby = 750")
    

                print("Flecha Madeira= 50")
                print("Flecha Ferro= 200")
                print("Flecha Pedra= 100")
                print("Flecha Diamante= 500")
                print("Flecha Ruby= 750")

                print("Machado Madeira= 75")
                print("Machado Ferro= 250")
                print("Machado Pedra= 150")
                print("Machado Diamante= 650")
                print("Machado Ruby= 1000")

                print("Pocao Cura = 200")

                compra=input("Quer Comprar Algo?")

                if compra == "Não":
                    print("Você Foi Embora")
                    
                elif compra == "Sim":
                    d=input("O Que Quer Comprar?")

                    if d == "Espada Madeira":
                        if dinheiro >= 50:
                            dinheiro = dinheiro - 50
                            inventario.append(espada_madeira)
                    
                    
    if fazer == "Status":
        
        print("━━━━━━━━━━━━━━ ⟡ ━━━━━━━━━━━━━━")
        print("Sua Vida é:" + str(vida))
        print("Sua Força é:" + str(forca))
        print("Sua Agilidade é:" + str(agilidade))
        print("Sua Magia é" + str(magia))
        print("Seu ID De Aventureiro é:" + str(id_user))
        print("Seu Dinheiro é:" + str(dinheiro))
        print("Seu Inventário é:" + str(inventario))
        print("━━━━━━━━━━━━━━ ⟡ ━━━━━━━━━━━━━━")

    if fazer == "Treinar":
        print("━━━━━━━━━━━━━━ ⟡ ━━━━━━━━━━━━━━")
        print("O Que Pode Treinar:")
        print("Vida")
        print("Força")
        print("Agilidade")
        print("Magia")
        print("━━━━━━━━━━━━━━ ⟡ ━━━━━━━━━━━━━━")
        
        treinar=input("O Que Você Quer Treinar?:")

        if treinar == "Força":
            print("1 Minuto de Treino == 50 de Força / Digite: 1 Minuto")
            print("5 Minuto de Treino == 250 de Força/ Digite: 5 Minuto")                     
            print("10 Minuto de Treino == 600 de Força/ Digite: 10 Minuto")

            tempo=input("Quanto Tempo?")

            if tempo == "1 Minuto":
                      time.sleep(60)
                      print("Parabens Você Upou 50 de Força")
                      forca += 50
            if tempo == "abu":
                      time.sleep(1)
                      print("Parabens Você Upou 250 de Força")
                      forca += 250         
            if tempo == "5 Minuto":
                      time.sleep(300)
                      print("Parabens Você Upou 250 de Força")
                      forca += 250
            if tempo == "10 Minuto":
                      time.sleep(600)
                      print("Parabens Você Upou 600 de Força")
                      forca += 600            

        if treinar == "Vida":
            print("1 Minuto de Treino == 50 de Vida / Digite: 1 Minuto")
            print("5 Minuto de Treino == 250 de Vida/ Digite: 5 Minuto")                     
            print("10 Minuto de Treino == 600 de Vida/ Digite: 10 Minuto")

            tempo=input("Quanto Tempo?")

            if tempo == "1 Minuto":
                      time.sleep(60)
                      print("Parabens Você Upou 50 de Vida")
                      vida += 50
            if tempo == "abu":
                      time.sleep(1)
                      print("Parabens Você Upou 250 de vida")
                      vida += 250
            if tempo == "5 Minuto":
                      time.sleep(300)
                      print("Parabens Você Upou 250 de Vida")
                      vida += 250
            if tempo == "10 Minuto":
                      time.sleep(600)
                      print("Parabens Você Upou 600 de Vida")
                      vida += 600

        if treinar == "Agilidade":
            print("1 Minuto de Treino == 50 de Agilidade / Digite: 1 Minuto")
            print("5 Minuto de Treino == 250 de Agilidade/ Digite: 5 Minuto")                     
            print("10 Minuto de Treino == 600 de Agilidade/ Digite: 10 Minuto")

            tempo=input("Quanto Tempo?")

            if tempo == "1 Minuto":
                      time.sleep(60)
                      print("Parabens Você Upou 50 de Agilidade")
                      agilidade += 50
            if tempo == "abu":
                      time.sleep(1)
                      print("Parabens Você Upou 250 de Agilidade")
                      agilidade += 250
            if tempo == "5 Minuto":
                      time.sleep(300)
                      print("Parabens Você Upou 250 de Agilidade")
                      agilidade += 250
            if tempo == "10 Minuto":
                      time.sleep(600)
                      print("Parabens Você Upou 600 de Agilidade")
                      agilidade+= 600

        if treinar == "Magia":
            print("1 Minuto de Treino == 50 de Magia / Digite: 1 Minuto")
            print("5 Minuto de Treino == 250 de Magia/ Digite: 5 Minuto")                     
            print("10 Minuto de Treino == 600 de Magia/ Digite: 10 Minuto")

            tempo=input("Quanto Tempo?")

            if tempo == "1 Minuto":
                      time.sleep(60)
                      print("Parabens Você Upou 50 de Magia")
                      magia += 50
            if tempo == "5 Minuto":
                      time.sleep(300)
                      print("Parabens Você Upou 250 de Magia")
                      magia += 250
            if tempo == "10 Minuto":
                      time.sleep(600)
                      print("Parabens Você Upou 600 de Magia")
                      magia+= 600
        
    if fazer == "Lutar":
        rolar=input("Digite 1d20 Para Procurar Um Monstro\n")

        if rolar == "1d20":
            d=random.randint(1,20)

            print(d)

            if d <=10:
                print("━━━━━━━ ⟡ ━━━━━━━")
                print("Você não encontra um Inimigo")
                print("━━━━━━━ ⟡ ━━━━━━━")
            elif d >=10:
                print("━━━━━━━ ⟡ ━━━━━━━")
                print("Você encontrou um inimigo")
                print("━━━━━━━ ⟡ ━━━━━━━")
                print("Atacar / Lançar Magia")
                print("━━━━━━━ ⟡ ━━━━━━━")
                monstro=random.randint(1,5)

                if monstro == 1:
                    print("Você Achou Um Goblin")
                elif monstro == 2:
                    print("Você Achou Um Lobo")
                elif monstro == 3:
                    print("Você Achou Uma Aranha Mutante")
                elif monstro == 4:
                    print("Você Achou Um Goblin Bombado")
                elif monstro == 5:
                    print("Você Achou Um Esqueleto com Arco")
                    
                fazer2=input("O Que Você Quer Fazer?:\n")
                
                if fazer2 == "Atacar":
                    b=random.randint(1,20)
                
                    if b <= 10 and forca < 150:
                        print("Seu Advérsario desviou ou você Não teve força suficiente")

                    elif forca > 150 and b >= 10:
                        dinheiro=random.randint(1,100)
                        inventario.append("Dinheiro" + str(dinheiro))
                        print(inventario)
                        print("Você Matou Seu Inimigo")
                        xp += 10

                if fazer2 == "Lançar Magia" and classe == "Mago":
                    if elemento == "Fogo":
                        dado=random.randint(1,20)
                        print("Você Lançou Uma Bola de Fogo...")
                        time.sleep(0.5)
                        if dado >= 10:
                            print("Parabéns Você Derrotou Seu Inimigo!")

                elif fazer2 == "Lançar Magia" and classe == "Mago":
                    if elemento == "Terra":
                        dado=random.randint(1,20)
                        print("Você Lançou Uma Pedra de Terra...")
                        time.sleep(0.5)
                        if dado >= 10:
                            print("Parabéns Você Derrotou Seu Inimigo!")

                elif fazer2 == "Lançar Magia" and classe == "Mago":
                    if elemento == "Água":
                        dado=random.randint(1,20)
                        print("Você Lançou Uma Bola de Água...")
                        time.sleep(0.5)
                        if dado >= 10:
                            print("Parabéns Você Derrotou Seu Inimigo!")                                

                elif fazer2 == "Lançar Magia":
                    if elemento == "Ar":
                        dado=random.randint(1,20)
                        print("Você Lançou Uma Ventoia...")
                        time.sleep(0.5)
                        if dado >= 10:
                             print("Parabéns Você Derrotou Seu Inimigo!")
