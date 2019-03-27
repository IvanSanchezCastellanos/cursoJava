package com.curso.java.oo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.curso.java.oo.model.CargoDePolicia;
import com.curso.java.oo.model.Persona;
import com.curso.java.oo.model.Policia;
import com.curso.java.oo.model.PoliciaDeLosDeLasPorras;
import com.curso.java.oo.model.PoliciaPistolero;

public class Ejemplo01HelloWorld {

		// java com.curso.java.oo.Ejemplo01HelloWorld arg1 arg2 arg3 .... argN
		public static void main(String[] args) {
			String miCadena = "Hola Mundo";
			System.out.println(miCadena);
			Persona.algoExplicito = "algo";
			Persona persona = new Persona();
			Persona persona2= new Persona();
			persona.setNombre("Rubencillo");
			persona.algoExplicito = "Es de rubencillo";
			persona2.setNombre("Otro nombre");
			Persona persona3 = new PoliciaDeLosDeLasPorras();
			PoliciaDeLosDeLasPorras poliPorrero = (PoliciaDeLosDeLasPorras) persona3;
			Policia policia = new Policia();
			policia.setCargo(CargoDePolicia.RASO);
			/* Da error la siguiente linea porque un poli no tiene porque ser polidelasporras, 
			 * por eso no pude hacerse el casting en este caso, de abajo a arriba en la
			 *  jerarquia si se puede castear, de arriba a abajo no*/
			// PoliciaDeLosDeLasPorras otroPorrero = (PoliciaDeLosDeLasPorras) policia;
			
			Set<Policia> setDePolicias = new HashSet<Policia>();
			setDePolicias.add(poliPorrero);
			setDePolicias.add((Policia) persona3);
			setDePolicias.add(new PoliciaPistolero());
			// Tamano es 2 porque en sets no hay duplicados y poliporrero y persona3 apuntan al mismo objeto, tenemos dos referencias a un solo objeto
			System.out.println(setDePolicias.size());
			
			List<Policia> lista = new ArrayList<Policia>();
			lista.add(poliPorrero);
			lista.add((Policia) persona3);
			lista.add(new PoliciaPistolero());
			// Tamano es 3 porque en listas hay duplicados, por lo que poliporrero y persona3 aunque apunten al mismo objeto, metemos ese mismo objeto dos veces en la lista
			System.out.println(lista.size());
			
			Map<String, Persona> mapa = new HashMap<String, Persona>(); // <K, V> primero el tipo de la clave y luego el del valor. Las claves no se pueden repetir pero los valores si
			mapa.put("ROJO", policia);
			mapa.put("VERDE", poliPorrero);
			mapa.put("ROJO", poliPorrero);	// En un mapa, cuando metes un valor con una clave que ya estaba previamente dentro del mapa, se borra el valor que estaba y se actualiza

			System.out.println(mapa.get("ROJO"));	// Imprime poliPorrero, ya que poliPorrero sobreescribe el antiguo valor policia que habia en el mapa
			
		}
}
