# Operador menor o igual que resultado - d <= b
# print(resultado)

#Operador mayor o igual que
#resultado = d >= b
#print(resultado)

a = int(input("Digite un numero: "))
print(f"El residuo de la division es: {a % 2}")
if a % 2 == 0:
    print(f"El valor de a es: {a} es un número PAR")
else:
    print(f"El valor de a es: {a} es un numero IMPAR")
    