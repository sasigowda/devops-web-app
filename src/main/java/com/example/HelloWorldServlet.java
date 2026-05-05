package com.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("    <title>Dashboard - DevOps Analytics</title>");
            out.println("    <style>");
            out.println("        * { margin: 0; padding: 0; box-sizing: border-box; }");
            out.println("        body {");
            out.println("            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;");
            out.println("            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);");
            out.println("            min-height: 100vh;");
            out.println("        }");
            out.println("        .navbar {");
            out.println("            background: rgba(255,255,255,0.95);");
            out.println("            padding: 1rem 2rem;");
            out.println("            box-shadow: 0 2px 10px rgba(0,0,0,0.1);");
            out.println("            display: flex;");
            out.println("            justify-content: space-between;");
            out.println("            align-items: center;");
            out.println("            position: sticky;");
            out.println("            top: 0;");
            out.println("            z-index: 1000;");
            out.println("        }");
            out.println("        .logo {");
            out.println("            font-size: 1.5rem;");
            out.println("            font-weight: bold;");
            out.println("            background: linear-gradient(135deg, #667eea, #764ba2);");
            out.println("            -webkit-background-clip: text;");
            out.println("            -webkit-text-fill-color: transparent;");
            out.println("        }");
            out.println("        .nav-menu { display: flex; list-style: none; gap: 1rem; }");
            out.println("        .nav-menu a {");
            out.println("            text-decoration: none;");
            out.println("            color: #333;");
            out.println("            font-weight: 500;");
            out.println("            padding: 0.5rem 1rem;");
            out.println("            border-radius: 5px;");
            out.println("            transition: all 0.3s;");
            out.println("        }");
            out.println("        .nav-menu a:hover {");
            out.println("            color: #667eea;");
            out.println("            background: #f0f0f0;");
            out.println("            transform: translateY(-2px);");
            out.println("        }");
            out.println("        .container { max-width: 1200px; margin: 2rem auto; padding: 2rem; }");
            out.println("        .hero-card {");
            out.println("            background: linear-gradient(135deg, #667eea, #764ba2);");
            out.println("            border-radius: 20px;");
            out.println("            padding: 2rem;");
            out.println("            text-align: center;");
            out.println("            color: white;");
            out.println("            margin-bottom: 2rem;");
            out.println("            animation: slideDown 0.8s ease-out;");
            out.println("        }");
            out.println("        .stats-grid {");
            out.println("            display: grid;");
            out.println("            grid-template-columns: repeat(auto-fit, minmax(280px, 1fr));");
            out.println("            gap: 1.5rem;");
            out.println("            margin-bottom: 2rem;");
            out.println("        }");
            out.println("        .stat-card {");
            out.println("            background: white;");
            out.println("            border-radius: 15px;");
            out.println("            padding: 2rem;");
            out.println("            text-align: center;");
            out.println("            transition: all 0.3s;");
            out.println("            animation: fadeInUp 0.6s ease-out;");
            out.println("            cursor: pointer;");
            out.println("        }");
            out.println("        .stat-card:hover {");
            out.println("            transform: translateY(-10px);");
            out.println("            box-shadow: 0 15px 40px rgba(0,0,0,0.15);");
            out.println("        }");
            out.println("        .stat-icon { font-size: 2.5rem; margin-bottom: 1rem; }");
            out.println("        .stat-value {");
            out.println("            font-size: 2.5rem;");
            out.println("            font-weight: bold;");
            out.println("            color: #667eea;");
            out.println("            margin: 0.5rem 0;");
            out.println("        }");
            out.println("        .chart-card {");
            out.println("            background: white;");
            out.println("            border-radius: 15px;");
            out.println("            padding: 2rem;");
            out.println("            margin-bottom: 2rem;");
            out.println("            animation: fadeInUp 0.8s ease-out;");
            out.println("        }");
            out.println("        .progress-section { margin-top: 2rem; }");
            out.println("        .progress-bar {");
            out.println("            width: 100%;");
            out.println("            height: 40px;");
            out.println("            background: #e0e0e0;");
            out.println("            border-radius: 20px;");
            out.println("            overflow: hidden;");
            out.println("            margin: 1rem 0;");
            out.println("        }");
            out.println("        .progress-fill {");
            out.println("            height: 100%;");
            out.println("            background: linear-gradient(90deg, #667eea, #764ba2);");
            out.println("            color: white;");
            out.println("            line-height: 40px;");
            out.println("            padding-left: 15px;");
            out.println("            animation: slideIn 1s ease-out;");
            out.println("        }");
            out.println("        @keyframes slideDown {");
            out.println("            from { opacity: 0; transform: translateY(-30px); }");
            out.println("            to { opacity: 1; transform: translateY(0); }");
            out.println("        }");
            out.println("        @keyframes fadeInUp {");
            out.println("            from { opacity: 0; transform: translateY(20px); }");
            out.println("            to { opacity: 1; transform: translateY(0); }");
            out.println("        }");
            out.println("        @keyframes slideIn {");
            out.println("            from { width: 0; }");
            out.println("            to { width: var(--width); }");
            out.println("        }");
            out.println("        @media (max-width: 768px) {");
            out.println("            .stats-grid { grid-template-columns: 1fr; }");
            out.println("        }");
            out.println("    </style>");
            out.println("    <script src=\"https://cdn.jsdelivr.net/npm/chart.js\"></script>");
            out.println("</head>");
            out.println("<body>");
            
            // Navigation
            out.println("    <nav class=\"navbar\">");
            out.println("        <div class=\"logo\">🚀 DevOps Dashboard</div>");
            out.println("        <ul class=\"nav-menu\">");
            out.println("            <li><a href=\"index.html\">🏠 Home</a></li>");
            out.println("            <li><a href=\"devops\">⚙️ DevOps</a></li>");
            out.println("            <li><a href=\"hello\" style=\"background:#667eea; color:white;\">📊 Dashboard</a></li>");
            out.println("            <li><a href=\"aws\">☁️ AWS</a></li>");
            out.println("        </ul>");
            out.println("    </nav>");
            
            out.println("    <div class=\"container\">");
            
            // Hero Section
            out.println("        <div class=\"hero-card\">");
            out.println("            <h1>📊 DevOps Analytics Dashboard</h1>");
            out.println("            <p>Real-time metrics and performance indicators for your CI/CD pipeline</p>");
            out.println("        </div>");
            
            // Statistics Cards
            out.println("        <div class=\"stats-grid\">");
            out.println("            <div class=\"stat-card\">");
            out.println("                <div class=\"stat-icon\">📈</div>");
            out.println("                <div class=\"stat-value\">99.9%</div>");
            out.println("                <h3>Uptime</h3>");
            out.println("                <p>Application availability</p>");
            out.println("            </div>");
            out.println("            <div class=\"stat-card\">");
            out.println("                <div class=\"stat-icon\">🚀</div>");
            out.println("                <div class=\"stat-value\">1,247</div>");
            out.println("                <h3>Deployments</h3>");
            out.println("                <p>Total successful deployments</p>");
            out.println("            </div>");
            out.println("            <div class=\"stat-card\">");
            out.println("                <div class=\"stat-icon\">⚡</div>");
            out.println("                <div class=\"stat-value\">245ms</div>");
            out.println("                <h3>Response Time</h3>");
            out.println("                <p>Average API response</p>");
            out.println("            </div>");
            out.println("        </div>");
            
            // Chart Card
            out.println("        <div class=\"chart-card\">");
            out.println("            <h2 style=\"color:#667eea; margin-bottom:1rem;\">Pipeline Performance Trends</h2>");
            out.println("            <canvas id=\"pipelineChart\" style=\"max-height: 400px; width:100%;\"></canvas>");
            out.println("        </div>");
            
            // Progress Metrics
            out.println("        <div class=\"chart-card\">");
            out.println("            <h2 style=\"color:#667eea; margin-bottom:1rem;\">Key Performance Metrics</h2>");
            out.println("            <div class=\"progress-section\">");
            out.println("                <h3>Build Success Rate</h3>");
            out.println("                <div class=\"progress-bar\"><div class=\"progress-fill\" style=\"width:94%\">94% Success Rate</div></div>");
            out.println("                <h3>Test Coverage</h3>");
            out.println("                <div class=\"progress-bar\"><div class=\"progress-fill\" style=\"width:87%\">87% Coverage</div></div>");
            out.println("                <h3>Deployment Frequency</h3>");
            out.println("                <div class=\"progress-bar\"><div class=\"progress-fill\" style=\"width:76%\">76% Daily</div></div>");
            out.println("                <h3>Security Scan Pass Rate</h3>");
            out.println("                <div class=\"progress-bar\"><div class=\"progress-fill\" style=\"width:96%\">96% Pass Rate</div></div>");
            out.println("            </div>");
            out.println("        </div>");
            
            out.println("    </div>");
            
            out.println("    <script>");
            out.println("        const ctx = document.getElementById('pipelineChart').getContext('2d');");
            out.println("        new Chart(ctx, {");
            out.println("            type: 'line',");
            out.println("            data: {");
            out.println("                labels: ['Week 1', 'Week 2', 'Week 3', 'Week 4', 'Week 5', 'Week 6'],");
            out.println("                datasets: [{");
            out.println("                    label: 'Deployments',");
            out.println("                    data: [12, 19, 15, 17, 22, 25],");
            out.println("                    borderColor: '#667eea',");
            out.println("                    backgroundColor: 'rgba(102, 126, 234, 0.1)',");
            out.println("                    borderWidth: 3,");
            out.println("                    tension: 0.4,");
            out.println("                    fill: true");
            out.println("                }, {");
            out.println("                    label: 'Success Rate (%)',");
            out.println("                    data: [92, 95, 93, 96, 97, 98],");
            out.println("                    borderColor: '#764ba2',");
            out.println("                    backgroundColor: 'rgba(118, 75, 162, 0.1)',");
            out.println("                    borderWidth: 3,");
            out.println("                    tension: 0.4,");
            out.println("                    fill: true");
            out.println("                }]");
            out.println("            },");
            out.println("            options: {");
            out.println("                responsive: true,");
            out.println("                maintainAspectRatio: true,");
            out.println("                plugins: {");
            out.println("                    legend: {");
            out.println("                        position: 'top',");
            out.println("                    },");
            out.println("                    tooltip: {");
            out.println("                        mode: 'index',");
            out.println("                        intersect: false");
            out.println("                    }");
            out.println("                },");
            out.println("                scales: {");
            out.println("                    y: {");
            out.println("                        beginAtZero: true,");
            out.println("                        grid: {");
            out.println("                            color: 'rgba(0,0,0,0.05)'");
            out.println("                        }");
            out.println("                    },");
            out.println("                    x: {");
            out.println("                        grid: {");
            out.println("                            display: false");
            out.println("                        }");
            out.println("                    }");
            out.println("                }");
            out.println("            }");
            out.println("        });");
            out.println("    </script>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
