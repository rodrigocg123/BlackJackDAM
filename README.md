# BlackJackDAM
Tarea para practicar en la semana no lectiva.
Se pide realizar un programa Java que simule la funcionalidad del Black Jack. 

Para ello el programa deberá contemplar 2 jugadores, la banca y el usuario, a los que se le ira dando una carta (número aleatorio entre 1 y 10), intercalando los turnos, hasta que se pase de 21 o se plante el jugador (la banca se plantará automáticamente si saca 16 o más). 

Al final se mostrara un mensaje indicando que jugador ha ganado y los puntos obtenidos (21 o más cerca sin pasarse).


La instrucción que se debe usar para dar una carta a la banca o al usuario es:
->  (int) (Math.random() * 10) + 1;