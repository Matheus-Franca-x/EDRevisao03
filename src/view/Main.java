package view;

import matheus.ListaString.ListaString;

public class Main 
{
	public static void main(String[] args)
	{
		
		String[] numVet = new String[89];
		
		int tam = numVet.length;
		
		for (int i = 0; i < tam; i++)
		{
			String n = Integer.toString(i + 11) + Integer.toString(9);
			n = n + Integer.toString((int) (Math.random() * 99999999));
			numVet[i] = n;
		}
		
		ListaString[] l = new ListaString[10];
		
		for (int i = 0; i < 10; i++)
			l[i] = new ListaString();
		
		for (String each : numVet)
		{
			try {
				if (l[hashCode(each)].isEmpty())
					l[hashCode(each)].addFirst(each);
				else
					l[hashCode(each)].addLast(each);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static int hashCode(String num)
	{
		int i = Integer.parseInt(num.substring(0, 2)) / 10;
		return i;
	}
}
