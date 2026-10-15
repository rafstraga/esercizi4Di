# Chiediamo il testo all'utente
testo = input("Inserisci una frase o un breve testo: ")

# 1. Numero totale di caratteri
tot_caratteri = len(testo)

# 2, 3 e 4. Contatori inizializzati a zero
lettere = 0
cifre = 0
altri = 0
vocali = 0
consonanti = 0

# Stringa di riferimento per le vocali
elenco_vocali = "aeiouàèéìòùAEIOUÀÈÉÌÒÙ"

# Analizziamo carattere per carattere con un semplice ciclo for
for c in testo:
    if c.isalpha():
        lettere += 1
        if c in elenco_vocali:
            vocali += 1
        else:
            consonanti += 1
    elif c.isdigit():
        cifre += 1
    else:
        altri += 1

# 5. Divisione in parole usando .split()
parole = testo.split()
num_parole = len(parole)

# Trovare la parola più lunga e la più corta 
if num_parole > 0:
    piu_lunga = parole[0]
    piu_corta = parole[0]
    
    for p in parole:
        if len(p) > len(piu_lunga):
            piu_lunga = p
        if len(p) < len(piu_corta):
            piu_corta = p
else:
    piu_lunga = "Nessuna"
    piu_corta = "Nessuna"

# Stampiamo i risultati in modo semplice
print("\n--- RISULTATI ---")
print("Caratteri totali:", tot_caratteri)
print("Lettere:", lettere)
print("Cifre:", cifre)
print("Altri caratteri:", altri)
print("Numero di parole:", num_parole)
print("Vocali:", vocali)
print("Consonanti:", consonanti)
print("Parola più lunga:", piu_lunga)
print("Parola più corta:", piu_corta)