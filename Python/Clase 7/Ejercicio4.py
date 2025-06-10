usuario = int(input("Ingresa tu edad: "))

if usuario >= 0 and usuario <= 10:
    print("La infancia es increible y bella!")
elif usuario >= 11 and usuario <= 19:
    print("Tienes muchos cambios, mucho que estudiar")

elif usuario >= 20 and usuario <= 29:
    print("Amor y comienzo del trabajo")

elif usuario >= 30 and usuario <= 39:
    print("Consolidación personal y profesional")

elif usuario >= 40 and usuario <= 49:
    print("Reflexión y madurez en la vida")

elif usuario >= 50 and usuario <= 59:
    print("Disfrute de los logros y estabilidad")

elif usuario >= 60 and usuario <= 69:
    print("Tiempo de cosechar lo vivido")

elif usuario >= 70 and usuario <= 79:
    print("Llegaste al final! A descansar")

elif usuario >= 80:
    print("Wow.. eso es.. impresionante")

else:
    print("Edad no válida")