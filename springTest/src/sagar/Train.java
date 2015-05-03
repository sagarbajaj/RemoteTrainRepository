package sagar;



/**
 * Hello world!
 *
 */
public class Train 
{
	private String structure;
	private static final String start="HHHH";
	private static final String pass="OOOO";
	private static final String rs="htht";
	private static final String cas="____";
	private static final String ender=">";
	private static final String joiner="::";
	private static final String cover="|";
	private static final String fs="^^^^";
	private static final String beg="<";




	public Train(String structure) {
		super();
		this.structure = structure;
	}
	public String print()
	  {
		StringBuilder sb=new StringBuilder();

		for(int i=0;i<structure.length();i++)
		{
			if(structure.charAt(i)=='H')
			{
				if(i!=structure.length()-1)
				{
					sb.append(Train.beg+Train.start);
				}
				else{sb.append(Train.start+Train.ender);}
			}
			else if(structure.charAt(i)=='P')
			{
				sb.append(Train.cover+Train.pass+Train.cover);
			}
			else if(structure.charAt(i)=='R')
			{
				sb.append(Train.cover+Train.rs+Train.cover);
			}
			else if(structure.charAt(i)=='C')
			{
				sb.append(Train.cover+Train.cas+Train.cover);
			}
			else if(structure.charAt(i)=='M')
			{
				sb.append(Train.cover+Train.fs+Train.cover);
			}
			if(i!=structure.length()-1){
				sb.append(Train.joiner);
			}
			else{}
		}
		String result=sb.toString();
		return result;
	  }
	public boolean fill()
	{
		StringBuilder f=new StringBuilder(structure);
	if(f.indexOf("C")==-1){
		return false;
	}else{
		for(int i=0;i<f.length();i++)
		{
			if(f.charAt(i)=='C')
			{
				f.setCharAt(i,'M');
				break;
			}
			
		}
		this.structure=f.toString();
	return true;
	}
	}
	public void detachHead()
	{
        StringBuilder dh=new StringBuilder(structure);
       if(dh.indexOf("H")==-1){}
       else
       {        for(int i=0;i<dh.length();i++)
        {
        	if(dh.charAt(i)=='H')
        	{
        		dh.deleteCharAt(i);
        		break;
        	}
        }
        this.structure=dh.toString();
       } 
       }
//        if(dh.charAt(0)=='H')
//        {
//        	dh.deleteCharAt(0);
//            this.structure=dh.toString();
//
//        }
	public void detachEnd()
	{
		StringBuilder de=new StringBuilder(structure);
		if(de.charAt(structure.length()-1)=='H')
		{de.deleteCharAt(structure.length()-1);
		this.structure=de.toString();
		
	}
		 System.out.println("sagar");
		}
	
	public static void main(String[] args)
	{
		Train t=new Train("HPRPH");
		System.out.println(t.print());
		t.detachEnd();
		System.out.println(t.print());
		t.detachHead();
		System.out.println(t.print());
		t.detachHead();
		System.out.println(t.print());

	}
}
