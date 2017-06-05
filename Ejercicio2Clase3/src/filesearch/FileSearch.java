package filesearch;
import java.io.File;


public class FileSearch implements Runnable {

	private String initPatch;
	private String fileName;
	
	public FileSearch(String iniPatch, String fileName)
	{ super();
	 this.initPatch=iniPatch;
	 this.fileName=fileName;
	} 
	
	 public void run(){
		 File file = new File(initPatch);	
        	if(file.isDirectory()){
		try{
			directoryProcess(file);
			}catch (InterruptedException e)
		{System.out.printf("%s: La busqueda ha sido interumpida ",Thread.currentThread().getName());
		}
		}
	
	 }
        	
        	
        	
			private void directoryProcess(File file) throws InterruptedException{
					File list[]=file.listFiles();
						if(list !=null){
	
							for(int i=0;i<list.length;i++){
									if(list[i].isDirectory()){
										directoryProcess(list[i]);
									}else{
											fileProcess(list[i]);
											}
														}
										}
						if(Thread.interrupted()){
			throw new InterruptedException();
												}
																				}

private void fileProcess(File file) throws InterruptedException{

if(file.getName().equals(fileName)){

System.out.printf("%s : %s\n ", Thread.currentThread().getName(), file.getAbsolutePath());


	if(Thread.interrupted())
		throw new InterruptedException();		
					}
			}
}
