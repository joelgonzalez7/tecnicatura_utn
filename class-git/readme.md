# ==========================================
# CLASE 1 - MIÉRCOLES
# ==========================================

# Abrimos Git Bash (Windows), terminal de Ubuntu o Mac y ejecutamos:

pwd            # Muestra la ruta actual
cd             # Navegar entre carpetas (change directory)
cd /           # Ir a la raíz del disco
cd ~           # Ir a la carpeta del usuario (home)
ls             # Lista los archivos del directorio actual
ls -al         # Lista todos los archivos, incluyendo ocultos
ls -l          # Lista detallada de archivos visibles
ls -a          # Lista todos los archivos, sin formato de lista
clear          # Limpia la consola (también Ctrl + L)
cd ..          # Subir un nivel de carpeta
cd U + [Tab]   # Autocompleta nombre de carpeta que empieza con U
cd /D          # Cambia de disco en Windows
df -h          # Muestra espacio de discos en Ubuntu
cd /mnt/d      # Accede a disco D desde WSL en Windows

# ==========================================
# AHORA COMENZAMOS CON LA CREACIÓN DE CARPETAS
# ==========================================

cd ..          # Subir nivel
cd ..          # Subir otro nivel
cd /mnt/c      # Ir al disco C desde WSL
cd ~           # Volver al home del usuario

mkdir Tecnicatura        # Crear carpeta (en Linux importa mayúsculas)
cd tecnicatura           # Entramos a la carpeta (ojo: en Linux es sensible a mayúsculas)
mkdir Python             # Crear carpeta Python
mkdir Java               # Crear carpeta Java
mkdir JavaScript         # Crear carpeta JavaScript


# ==========================================
# CLASE 2 - MIÉRCOLES
# ==========================================

# Abrimos Git Bash en Windows (como administrador), o terminal en Linux/Mac

touch vacio.txt          # Crea un archivo vacío llamado vacio.txt
# Escribir dentro del archivo en VSCode o con nano/vim
ctrl + s                 # Guardar lo que escribimos

./                       # Hace referencia a la carpeta actual
../                      # Hace referencia a la carpeta anterior

cat vacio.txt            # Muestra el contenido del archivo vacio.txt

history                  # Muestra todos los comandos usados en la sesión
!72                      # Ejecuta el comando número 72 del historial (cambiar 72 por el número deseado)

rm vacio.txt             # Borra el archivo vacio.txt (¡Precaución!)
rm --help                # Muestra ayuda sobre el comando rm

# ==========================================
# CREAR UN REPOSITORIO DE GIT Y HACER EL PRIMER COMMIT
# ==========================================

cd tecnicatura           # Entramos a la carpeta principal
mkdir class-git          # Creamos una carpeta nueva para la clase
cd class-git             # Ingresamos a la carpeta

git init                 # Inicializa un repositorio Git local (.git)
code .                   # Abre VSCode en esta carpeta

# En VSCode:
ctrl + n                 # Nuevo archivo
# Escribir contenido
ctrl + s                 # Guardar como historia.txt

git status               # Ver estado actual del repositorio
git add historia.txt     # Agrega el archivo al área de preparación (staging)
git status               # Verificamos que el archivo fue agregado

git rm --cached historia.txt   # Lo quitamos del área de preparación

git config                     # Ver info general sobre configuración
git config --list              # Lista configuraciones actuales
git config --list --show-origin   # Muestra origen de cada config

git config --global user.name "Ariel Betancud"
git config --global user.email "betancudariel@gmail.com"
# Importante: usar el mismo email que en GitHub

git config --list              # Confirmamos que se guardaron los datos

git add .                      # Agrega todos los archivos al área de preparación
git commit -m "Mensaje importante del commit"   # Primer commit

# Hacemos cambios en historia.txt y guardamos (code .)
git status                     # Verifica cambios nuevos
git add .                      # Prepara todos los cambios
git commit -m "Mi segundo commit"   # Segundo commit

git log historia.txt           # Muestra historial de commits del archivo



# ==========================================
# CLASE 3 - MIÉRCOLES
# Analizar cambios en los archivos de tu proyecto Git - Parte 3
# ==========================================

# Abrimos Git Bash en Windows (como administrador) o la terminal en Linux/Mac (usar sudo si es necesario)

cd tecnicaturagit          # Ingresamos al directorio donde trabajamos

ls                         # Listamos archivos y carpetas

cd git                     # Entramos a la carpeta git (vacía, en este caso)
cd ..                      # Volvemos al nivel anterior

rm historia.txt            # Eliminamos un archivo (solo con fines prácticos)
rm Git                     # ERROR: no se puede borrar una carpeta con rm solo

rm --recursive -R Git      # Borra una carpeta y todo su contenido (precaución)

rm --help                  # Muestra la documentación del comando rm

# ==========================================
# Crear carpeta y archivo README.md
# ==========================================

mkdir class-git            # Creamos carpeta para trabajar Git localmente
cd class-git               # Entramos en esa carpeta

touch README.md            # Creamos un archivo Markdown (README.md)
# .md = markdown, se puede editar con VSCode, se transforma en HTML en GitHub

# Leer documentación de Markdown en GitHub para practicar su uso en README

code .                     # Abrimos VSCode en la carpeta actual

# Cargamos en el README.md los comandos vistos en clases anteriores

git status                 # Verificamos cambios en el repositorio
git add .                  # Agregamos todos los archivos modificados al área de staging
git status                 # Confirmamos que los cambios fueron agregados

git commit -m "Cargamos el README dentro del directorio class-git"  # Hacemos el commit

git status                 # Verificamos que no haya cambios pendientes
git log                    # Vemos el historial de commits (puede haber más si se trabajó previamente)

cd ..                      # Subimos un nivel
cd ..                      # Subimos otro nivel


# ==========================================
# CLASE 4 - MIÉRCOLES 30 DE ABRIL DEL 2025
# Analizar cambios en Git (Parte 4)
# ==========================================

# Abrimos Git Bash como administrador o usamos sudo en Linux/Mac

cd tecnicatura
cd class-git
ls

touch historia.txt       # Crear archivo vacío
code .                   # Abrir VSCode en esta carpeta

# Editamos historia.txt y escribimos:
# Bienvenido, mi nombre es Ariel (reemplazar con tu nombre)

# Guardamos con Ctrl + S y volvemos a la terminal

git status               # Ver estado del repo
git add .                # Agregar todos los archivos al área de staging
git status               # Verificamos que se agregaron

git commit               # Commit sin mensaje: se abre editor (Vim)

# Para salir y guardar mensaje:
Esc                      # Salir del modo de inserción
:wq! + Enter             # Guardar y salir (Git Bash en Windows)
# o
Esc + Shift + Z + Z      # Alternativa en algunas terminales Linux

# Agregamos otra línea en historia.txt: "estoy estudiando programación"
# Guardamos con Ctrl + S

git add .
git commit               # Nuevo commit, mismo procedimiento

# En caso de usar Vim:
Esc + i                  # Insertar texto (a veces no necesario)
Ctrl + X                 # Salir (en algunos editores)
s + Enter                # Confirmar mensaje (sí) y continuar (Linux)

git show                 # Ver detalles del último commit
git log historia.txt     # Ver historial de commits para ese archivo
q                        # Salir del log

# Comparar dos versiones (copiar hashes de commits previos):

git diff <hash_viejo> <hash_nuevo>   # Comparar cambios entre dos commits
q                        # Salir

cd ..
cd ..