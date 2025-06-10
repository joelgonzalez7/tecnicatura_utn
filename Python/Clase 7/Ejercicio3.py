usuario = int(input("Ingrese un mes del año: "))

if usuario > 0 and usuario <= 3:
    print("Es verano - fecha: 21/12 al 21/03")

elif usuario >= 4 and usuario <= 6:
    print("Es otoño - fecha: 21/03 al 21/06")
elif usuario >= 7 and usuario <= 9:
    print("Es invierno - fecha: 21/06 al 21/09")
elif usuario >= 10 and usuario <= 12 :
    print("Es primavera - fecha: 21/09 al 21/12")
else:
    print("El mes no es correcto")


    