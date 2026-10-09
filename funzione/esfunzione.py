import random

def straga_somma(num1, num2):
    return num1+num2

def straga_moltiplicazione(num1, num2):
    return num1*num2

def straga_sottrazione(num1, num2):
    return num1-num2

def straga_divisione(dividendo, divisore):
    if(divisore!=0):
        return dividendo/divisore

    return "non è possibile dividere per 0"

numero1=random.randint(-999,999)
numero2=random.randint(-999,999)

print(numero1)
print(numero2)

print(f"la somma di {numero1} e di {numero2} è {straga_somma(numero1,numero2)}")
print(f"la sottrazione di {numero1} e di {numero2} è {straga_sottrazione(numero1,numero2)}")
print(f"la moltiplicazione di {numero1} e di {numero2} è {straga_moltiplicazione(numero1,numero2)}")
print(f"la divisione di {numero1} e di {numero2} è {straga_divisione(numero1,numero2)}")