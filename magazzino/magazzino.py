def aggiungi_prodotto(listaspesa):
    prodotto = input("Inserisci un prodotto: ")
    listaspesa.append(prodotto)
    return listaspesa


def aggiungi_prezzo(listaprezzi):
    prezzo = input("Inserisci il prezzo: ")
    listaprezzi.append(prezzo)
    return listaprezzi


def rimuovi_prodotto(listaspesa, listaprezzi):
    prodotto = input("Inserisci un prodotto da rimuovere: ")

    if prodotto in listaspesa:
        indice = listaspesa.index(prodotto)

        listaspesa.pop(indice)
        listaprezzi.pop(indice)

        print("Prodotto rimosso dalla lista.")
    else:
        print("Il prodotto non è presente nella lista.")

    return listaspesa, listaprezzi


def visualizza_lista(listaspesa, listaprezzi):
    print("\nLa lista della spesa contiene:")

    for prodotto, prezzo in zip(listaspesa, listaprezzi):
        print(f"- {prodotto} (Prezzo: {prezzo} €)")


def main():
    listaspesa = ["pane", "farina"]
    listaprezzi = ["1", "1.20"]

    while True:
        print("\nMenu:")
        print("1. Aggiungi prodotto")
        print("2. Rimuovi prodotto")
        print("3. Visualizza lista")
        print("4. Esci")

        scelta = input("Scegli un'opzione: ")

        if scelta == "1":
            listaspesa = aggiungi_prodotto(listaspesa)
            listaprezzi = aggiungi_prezzo(listaprezzi)

        elif scelta == "2":
            listaspesa, listaprezzi = rimuovi_prodotto(
                listaspesa, listaprezzi
            )

        elif scelta == "3":
            visualizza_lista(listaspesa, listaprezzi)

        elif scelta == "4":
            print("Uscita dal programma.")
            break

        else:
            print("Opzione non valida. Riprova.")


if __name__ == "__main__":
    main()