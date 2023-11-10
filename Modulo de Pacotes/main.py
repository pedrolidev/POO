# from cli.cli import le_nome
from projeto.cli import cli
# from cli import cli as c
# from cli.cli import * -> NÃO USAR!!!!!!

def main():
    # nome = le_nome()
    # nome = cli.le_nome()
    # print("Olá,", nome)
    # print(cli.NUMERO_MAXIMO_ITENS)
    cli.interface()

if __name__ == "__main__":
    main()