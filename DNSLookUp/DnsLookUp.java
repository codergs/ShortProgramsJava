package dnsLookUp;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.*;

public class DNSLookUp {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		String addressIp,addressIp1,addressIp2,ip;

		System.out.print("Enter the specified host name:");

		addressIp=input.nextLine();
		System.out.print("First Host=");

		try{
		InetAddress c=InetAddress.getByName(addressIp.trim());
		System.out.println(c);
		
		ip=c.getHostAddress();
		System.out.print("The IP address of first Host is: "+ip);
		
		
		}catch (UnknownHostException e){
			System.out.println("Not a valid Host Name");
		}
	
		
		try{
			
			System.out.print("\nReverse DNS lookup for above IP: ");
			String f=InetAddress.getByName(addressIp.trim()).getCanonicalHostName();
			System.out.print(f);
		
			
		}catch(UnknownHostException sc){
			System.out.println("Not a valid IP");
		}
			
		try{
			InetAddress localhost=InetAddress.getLocalHost();
			System.out.println("\nLocal Host= "+localhost);
			String abc=localhost.getHostAddress();
			System.out.println(abc);
			String b=localhost.getHostName();
			System.out.println(b);

		}catch (UnknownHostException e){
			System.out.println("Local Host couldn't be resolved into an address");
		}
	}
}
		