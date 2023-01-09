import java.rmi.*;
import java.rmi.server.*;
public class Serverrpc
{
public static void main(String arg[])
{
try
{
rpc ob=new rpc();
Naming.rebind("serverrpc", (Remote) ob);
}
catch(Exception e)
{}}}