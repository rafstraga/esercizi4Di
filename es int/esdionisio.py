numeri=[1,2,3,4,5]
print(numeri)

nuovo_numero = int(input("inserisci il primo numero da aggiungere alla lista: "))
print(nuovo_numero)

if (nuovo_numero>10):
    numeri.append(nuovo_numero)
ind=0
while ind<len(numeri):
    print(numeri[ind])
    ind+=1


