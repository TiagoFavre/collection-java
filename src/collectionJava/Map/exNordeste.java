package collectionJava.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Comparator;
import java.util.HashMap;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:

 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */

public class exNordeste {

	public static void main(String[] args) {
		
		  System.out.println("Crie um dicionario que relacione os estados e suas respectivas populacoes: ");
	        Map<String, Integer> populaçãoEstadosNE = new HashMap<>() {{
	            put("PE", 9616621);
	            put("AL", 3351543);
	            put("CE", 9187103);
	            put("RN", 3534265);
	        }};
	        System.out.println(populaçãoEstadosNE);

	        System.out.println("Substitua a populacao do estado RN por : 3.534.165");
	        populaçãoEstadosNE.put("RN", 3534165);
	        System.out.println(populaçãoEstadosNE);

	        System.out.println("Confira se o estado da Paraiba (PB) tucson esta no dicionario, caso nao, adicione " +
	                "PB - 4.039.277: ");
	        populaçãoEstadosNE.put("PB", 4039277);
	        System.out.println(populaçãoEstadosNE);

	        System.out.println("Exiba a populacao do estado PE: " + populaçãoEstadosNE.get("PE"));

	        System.out.println("Exiba todos os estados e suas populacoes na ordem em que foram informados: ");
	        Map<String, Integer> populaçãoEstadosNE2 = new LinkedHashMap<>() {{
	            put("PE", 9616621);
	            put("AL", 3351543);
	            put("CE", 9187103);
	            put("RN", 3534265);
	            put("PB", 4039277);
	        }};
	        System.out.println(populaçãoEstadosNE2);

	        System.out.println("Exiba todos os estados e suas populacoes na ordem alfabetica: ");
	        Map<String, Integer> populaçãoEstadosNE3 = new TreeMap<>(populaçãoEstadosNE);
	        System.out.println(populaçãoEstadosNE3);

	        Collection<Integer> populacao = populaçãoEstadosNE.values();
	        String estadoMaiorPopulacao = "";
	        String estadoMenorPopulacao = "";
	        for (Map.Entry<String, Integer> entry : populaçãoEstadosNE.entrySet()) {
	            if (entry.getValue().equals(Collections.max(populacao))) estadoMaiorPopulacao = entry.getKey();
	            if (entry.getValue().equals(Collections.min(populacao))) estadoMenorPopulacao = entry.getKey();
	        }
	        System.out.printf("Exiba o estado com o menor populacao (%s) e seu respectivo valor (%d)\n",
	                estadoMenorPopulacao, Collections.min(populacao));
	        System.out.printf("Exiba o estado com a maior populacao (%s) e seu respectivo valor (%d)\n",
	                estadoMaiorPopulacao, Collections.max(populacao));

	        int soma = 0;
	        Iterator<Integer> iterator = populaçãoEstadosNE.values().iterator();
	        while (iterator.hasNext()) {
	            soma += iterator.next();
	        }
	        System.out.println("Exiba a soma da populacao desses estados: " + soma);
	/*        int soma2 = 0;
	       for(Map.Entry<String, Integer> entry : populaçãoEstadosNE.entrySet()) {
	           soma2 += entry.getValue();
	       }
	*/

	        System.out.println("Exiba a media da populacao deste dicionario de estados: " + (soma / populaçãoEstadosNE.size()));
	        System.out.println("Remova os estados com a populacao menor que 4.000.000: ");
	        Iterator<Integer> iterator1 = populaçãoEstadosNE.values().iterator();
	        while (iterator1.hasNext()) {
	            if (iterator1.next() <= 4000000) iterator1.remove();
	        }
	        System.out.println(populaçãoEstadosNE);

	        System.out.println("Apague o dicionario de estados com suas respectivas populacoes estimadas: ");
	        populaçãoEstadosNE.clear();
	        System.out.println(populaçãoEstadosNE);

	        System.out.println("Confira se a lista esta vazia: " + populaçãoEstadosNE.isEmpty());
	}
}