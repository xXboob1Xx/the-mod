package harry.mod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import proxy.CommonProxy;
import until.Reference;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
   @Instance
   public static Main Instance;
   
   @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.Common)
   public static CommonProxy proxy;
   
   @EventHandler
   public static void preInit(FMLPreInitializationEvent event) {}
   @EventHandler
   public static void init(FMLInitializationEvent event) {}
   @EventHandler
   public static void postInit(FMLPostInitializationEvent event) {}
}
