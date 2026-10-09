''' acquisire una lista di 10 numeri interi random e comunicare
 la somma e la media dei numeri in lista utilizzando due funzioni rispettivamente somma e media'''

import random


def somma(lista):
    somma=0
    for i in lista:
        somma+=i
    return somma

def media(lista):
    return somma(lista)/len(lista)

lista=[]
print(lista)
for i in range(10):
    lista.append(random.randint(0,10))
print(lista)


print(f"la somma dei numeri in lista è {somma(lista)}")
print(f"la media dei numeri in lista è {media(lista)}")