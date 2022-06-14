package miplugin.miplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginDescriptionFile;

public final class Miplugin extends JavaPlugin {
    PluginDescriptionFile pdfFile = getDescription();
    public String version = pdfFile.getVersion();
    public String nombre = pdfFile.getName();
    public String versionApi = pdfFile.getAPIVersion();
    @Override
    public void onEnable(){
        Bukkit.getConsoleSender().sendMessage(nombre + " A sido activado (Version: " + version+ ") (VersionApi: " + versionApi + ")");
    }
    @Override
    public void onDisable(){
        Bukkit.getConsoleSender().sendMessage("Adios n-n");
    }
}