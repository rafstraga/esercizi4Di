lista=[]
print(lista)

lista=[1,2,5,"tre", [5,"sei"]]
print(lista)

for elementochevoglio in lista:
    print(elementochevoglio)
    for indice in range(1,10):
        print(indice)
    i=0
    while (i<10):
        print("sto facendo qualcosa")
        i+=1
    while True:
        print("silenzio")
        if i>1:
            break
        else:
            i+=1
        