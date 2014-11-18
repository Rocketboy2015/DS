import java.io.*;
import java.util.*;
import java.lang.Object;
import java.lang.management.*;

public class LLInsertTest{
	public static void main(String[] args){
		LinkedList<String> list = new LinkedList<String>();
		for(String s : args){
			binInsert(list, s, 0 , list.size()-1);
		}
		System.out.println(list);

	}
//////////////////////////////////////////////////////////////////////////////////
	public static void binInsert(LinkedList<String> list,String item, int ini, int fini){
		if(list==null){ list.add(item); return;}
		if(ini>fini){
			list.add(ini,item);
			return;
		}

		int k = (fini+ini)/2;

		if(list.get(k).compareTo(item)<0){
			binInsert(list,item,k+1,fini);
		}
		else if(list.get(k).compareTo(item)>0){
			binInsert(list,item,ini,k-1);
		}
		else{ return; }

	}
}