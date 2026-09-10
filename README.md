# Ejercicio 1 - Redacción de noticias deportivasm del Projecte

📌 ¿Estás diseñando un sistema para una redacción de noticias deportivas. Las noticias están clasificadas según el deporte al que hacen referencia: fútbol, ​​baloncesto, tenis, F1 y motociclismo .

En la redacción pueden trabajar varios redactores . De cada redactor hay que guardar el nombre , el DNI y el sueldo . Ten en cuenta:

El DNI no puede cambiar una vez asignado (debe ser inmutable).
Todos los redactores tienen el mismo sueldo , que actualmente es de 1500€. Si la empresa decide subirlo, lo hará para todos a la vez (atributo común).
Cada redactor puede escribir múltiples noticias . Toda noticia debe tener un titular , un texto (que estará vacío cuando se crea), una puntuación y un precio .

Cada tipo de noticia contiene información específica según el deporte:

Fútbol : competición, club y jugador.
Baloncesto : competición y club.
Tenis : competición y tenistas.
F1 : escudería.
Motociclismo : equipo.

## ✨ herencia , atributos estáticos y finales , polimorfismo , y la gestión de objetos relacionados entre sí

## 🛠 Tecnologies
JAVA

## 🚀 Instal·lació i Execució
1. Clonar el repositori: `git clone ...`
2. Variables d'entorn: Crear `.env` amb...
3. Execució de l'aplicació.
4. Proves: Com executar les proves.

## 📸 Demo
[Enllaç a Vercel/Netlify] o captures de pantalla. (si és aplicable)

## 🧩 Execution:
### Creado todas las clases y subclases, Redactores y todos tipos de noticias.
### Creado el menu en el Main
### Creado el primo ArrayList de Redactores para almacenar los redactores creados.
### Craedo el ArrayList para guardar los articulos en cada redactor, tambièn he conseguido crear los metodos addRedactor, removeRedactor y addNews.
### Creado el metodo removeNews usando for, if, switch y llamando Arraylist y Arraylist como atributos.