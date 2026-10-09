# inizio
print("benvenuto in calcolatrice!")
numero1=int(input("Inserisci il primo numero: "))
numero2=int(input("Inserisci il secondo numero: "))

#scegliere l'operatore
print("Scegli l'operazione da eseguire:")
print("1. Addizione")
print("2. Sottrazione")
print("3. Moltiplicazione")
print("4. Divisione")

operazione=int(input("Inserisci il numero dell'operazione: "))
#scelte (tipo switch ma fatto con elif)
if operazione==1:
    risultato=numero1+numero2
    print("Il risultato dell'addizione è:", risultato)
elif operazione==2:
    risultato=numero1-numero2
    print("Il risultato della sottrazione è:", risultato)
elif operazione==3:
    risultato=numero1*numero2
    print("Il risultato della moltiplicazione è:", risultato)
elif operazione==4:
    if numero2!=0:
        risultato=numero1/numero2
        print("Il risultato della divisione è:", risultato)
    else:
        print("Errore: Divisione per zero non consentita.")
else:
    print("Operazione non valida.")