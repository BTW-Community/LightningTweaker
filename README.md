# LightningTweaker
An addon for [Better Than Wolves - Community Edition](https://github.com/BTW-Community/BTW-Public) that allows you to disable fire spawning from lightning strikes.

[Downloads](https://github.com/BTW-Community/LightningTweaker/releases/latest)


Are you tired of lightning burning down your landscape? Does it annoy you to the point where you turn off weather using cheats? Well then, this is the addon for you!

Lightning Tweaker currently lets you stop lightning from creating fire entirely. Simply type in `/lightning setFire false` and lightning will stop producing fire. This modifies a value in `level.dat`, so it will be unique for all worlds.

This addon should also work on servers, and the client does not need to have the addon installed to use it.

## List of modified classes
<details>
  <summary>Client</summary>
  
  - BlockLeaves
  - FCEntityLightningBolt
</details>

<details>
  <summary>Server</summary>
  
  - BlockLeaves
  - FCEntityLightningBolt
  - MinecraftServer
</details>
