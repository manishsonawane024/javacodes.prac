public class leon{
public static void main(String args[]) {
    try { 
    ImplExample obj = new ImplExample();
    Hello stub = (Hello)
   UnicastRemoteObject.exportObject(obj, 0);  
    Registry registry = LocateRegistry.getRegistry();
    registry.bind("Hello", stub); 
    System.err.println("Server ready");
    } catch (Exception e) {
    System.err.println("Server exception: " + e.toString());
    e.printStackTrace();
    }
    }
}
   