def aggiungi_prodotto(listaspesa):
    prodotto = input("inserisci un prodotto: ")
    listaspesa.append(prodotto)
    return listaspesa

def rimuovi_prodotto(listaspesa):
    prodotto = input("inserisci un prodotto da rimuovere: ")
    if prodotto in listaspesa:
        listaspesa.remove(prodotto)
        print("Prodotto rimosso dalla lista.")
    else:
        print("Il prodotto non è presente nella lista.")
    
    return listaspesa


def visualizza_lista(listaspesa):
    print("La lista della spesa contiene:")
    for prodotto in listaspesa:
        print("- " + prodotto)


def main():
    listaspesa = ["pane", "farina"]

    while True:
        print("\nMenu:")
        print("1. Aggiungi prodotto")
        print("2. Rimuovi prodotto")
        print("3. Visualizza lista")
        print("4. Esci")
        
        scelta = input("Scegli un'opzione: ")
        
        if scelta == "1":
            listaspesa = aggiungi_prodotto(listaspesa)
        elif scelta == "2":
            listaspesa = rimuovi_prodotto(listaspesa)
        elif scelta == "3":
            visualizza_lista(listaspesa)
        elif scelta == "4":
            print("Uscita dal programma.")
            break
        else:
            print("Opzione non valida. Riprova.")


if __name__ == "__main__":
    main()