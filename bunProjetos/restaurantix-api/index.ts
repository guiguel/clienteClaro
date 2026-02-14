// index.ts
console.log("🚀 Iniciando Restaurantix API com Bun.js!");

const server = Bun.serve({
  port: 3000,
  fetch(request) {
    const url = new URL(request.url);
    
    if (url.pathname === "/") {
      return new Response("🍽️ Restaurantix API está funcionando!");
    }
    
    if (url.pathname === "/health") {
      return Response.json({ 
        status: "ok", 
        timestamp: new Date().toISOString(),
        runtime: "Bun.js"
      });
    }
    
    return new Response("Rota não encontrada", { status: 404 });
  }
});

console.log(`🌟 Servidor rodando em http://localhost:${server.port}`);