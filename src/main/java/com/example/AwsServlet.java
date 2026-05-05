package com.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/aws")
public class AwsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("    <title>AWS Cloud Dashboard</title>");
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
            out.println("        .container {");
            out.println("            max-width: 1400px;");
            out.println("            margin: 2rem auto;");
            out.println("            padding: 2rem;");
            out.println("        }");
            out.println("        .hero-card {");
            out.println("            background: linear-gradient(135deg, #667eea, #764ba2);");
            out.println("            color: white;");
            out.println("            border-radius: 20px;");
            out.println("            padding: 2rem;");
            out.println("            margin-bottom: 2rem;");
            out.println("            text-align: center;");
            out.println("            box-shadow: 0 10px 30px rgba(0,0,0,0.2);");
            out.println("            animation: slideDown 0.8s ease-out;");
            out.println("        }");
            out.println("        .hero-card h1 {");
            out.println("            font-size: 2.5rem;");
            out.println("            margin-bottom: 1rem;");
            out.println("        }");
            out.println("        .stats-container {");
            out.println("            display: grid;");
            out.println("            grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));");
            out.println("            gap: 1.5rem;");
            out.println("            margin-bottom: 2rem;");
            out.println("        }");
            out.println("        .stat-box {");
            out.println("            background: white;");
            out.println("            border-radius: 15px;");
            out.println("            padding: 1.5rem;");
            out.println("            text-align: center;");
            out.println("            box-shadow: 0 5px 15px rgba(0,0,0,0.1);");
            out.println("            transition: transform 0.3s;");
            out.println("            animation: fadeInUp 0.6s ease-out;");
            out.println("        }");
            out.println("        .stat-box:hover {");
            out.println("            transform: translateY(-10px);");
            out.println("        }");
            out.println("        .stat-number {");
            out.println("            font-size: 2rem;");
            out.println("            font-weight: bold;");
            out.println("            color: #667eea;");
            out.println("            margin: 0.5rem 0;");
            out.println("        }");
            out.println("        .services-grid {");
            out.println("            display: grid;");
            out.println("            grid-template-columns: repeat(auto-fill, minmax(320px, 1fr));");
            out.println("            gap: 1.5rem;");
            out.println("            margin-top: 1rem;");
            out.println("        }");
            out.println("        .service-card {");
            out.println("            background: white;");
            out.println("            border-radius: 15px;");
            out.println("            padding: 1.5rem;");
            out.println("            transition: all 0.3s;");
            out.println("            cursor: pointer;");
            out.println("            animation: fadeInUp 0.6s ease-out;");
            out.println("            position: relative;");
            out.println("            overflow: visible;");
            out.println("        }");
            out.println("        .service-card:hover {");
            out.println("            transform: translateY(-5px);");
            out.println("            box-shadow: 0 10px 30px rgba(0,0,0,0.15);");
            out.println("        }");
            out.println("        .service-icon {");
            out.println("            font-size: 2.5rem;");
            out.println("            margin-bottom: 1rem;");
            out.println("        }");
            out.println("        .service-tag {");
            out.println("            display: inline-block;");
            out.println("            padding: 0.25rem 0.75rem;");
            out.println("            background: linear-gradient(135deg, #667eea, #764ba2);");
            out.println("            color: white;");
            out.println("            border-radius: 20px;");
            out.println("            font-size: 0.75rem;");
            out.println("            margin-bottom: 1rem;");
            out.println("        }");
            out.println("        /* Tooltip styles */");
            out.println("        .service-card { position: relative; }");
            out.println("        .tooltip {");
            out.println("            visibility: hidden;");
            out.println("            width: 320px;");
            out.println("            background: linear-gradient(135deg, #1a1a2e, #16213e);");
            out.println("            color: #fff;");
            out.println("            text-align: left;");
            out.println("            border-radius: 10px;");
            out.println("            padding: 15px;");
            out.println("            position: absolute;");
            out.println("            z-index: 1000;");
            out.println("            bottom: 125%;");
            out.println("            left: 50%;");
            out.println("            margin-left: -160px;");
            out.println("            opacity: 0;");
            out.println("            transition: opacity 0.3s, visibility 0.3s;");
            out.println("            box-shadow: 0 5px 20px rgba(0,0,0,0.3);");
            out.println("            font-size: 13px;");
            out.println("            line-height: 1.5;");
            out.println("            pointer-events: none;");
            out.println("        }");
            out.println("        .tooltip::after {");
            out.println("            content: '';");
            out.println("            position: absolute;");
            out.println("            top: 100%;");
            out.println("            left: 50%;");
            out.println("            margin-left: -10px;");
            out.println("            border-width: 10px;");
            out.println("            border-style: solid;");
            out.println("            border-color: #16213e transparent transparent transparent;");
            out.println("        }");
            out.println("        .service-card:hover .tooltip {");
            out.println("            visibility: visible;");
            out.println("            opacity: 1;");
            out.println("        }");
            out.println("        .tooltip h4 {");
            out.println("            color: #667eea;");
            out.println("            margin-bottom: 10px;");
            out.println("            font-size: 16px;");
            out.println("        }");
            out.println("        .tooltip ul {");
            out.println("            margin-left: 20px;");
            out.println("            margin-top: 5px;");
            out.println("        }");
            out.println("        .tooltip li {");
            out.println("            margin: 5px 0;");
            out.println("        }");
            out.println("        @keyframes slideDown {");
            out.println("            from { opacity: 0; transform: translateY(-30px); }");
            out.println("            to { opacity: 1; transform: translateY(0); }");
            out.println("        }");
            out.println("        @keyframes fadeInUp {");
            out.println("            from { opacity: 0; transform: translateY(20px); }");
            out.println("            to { opacity: 1; transform: translateY(0); }");
            out.println("        }");
            out.println("        @media (max-width: 768px) {");
            out.println("            .services-grid { grid-template-columns: 1fr; }");
            out.println("            .tooltip { width: 260px; margin-left: -130px; }");
            out.println("        }");
            out.println("    </style>");
            out.println("</head>");
            out.println("<body>");
            
            // Navigation
            out.println("    <nav class=\"navbar\">");
            out.println("        <div class=\"logo\">DevOps Dashboard</div>");
            out.println("        <ul class=\"nav-menu\">");
            out.println("            <li><a href=\"index.html\">Home</a></li>");
            out.println("            <li><a href=\"devops\">DevOps</a></li>");
            out.println("            <li><a href=\"hello\">Dashboard</a></li>");
            out.println("            <li><a href=\"aws\" style=\"background:#667eea; color:white;\">AWS</a></li>");
            out.println("        </ul>");
            out.println("    </nav>");
            
            out.println("    <div class=\"container\">");
            
            // Hero Section
            out.println("        <div class=\"hero-card\">");
            out.println("            <h1>Amazon Web Services</h1>");
            out.println("            <p>Comprehensive cloud infrastructure services powering modern applications</p>");
            out.println("            <p style=\"margin-top: 10px; font-size: 14px;\">💡 Hover on any service to see detailed information</p>");
            out.println("        </div>");
            
            // Statistics
            out.println("        <div class=\"stats-container\">");
            out.println("            <div class=\"stat-box\"><div>🌍</div><div class=\"stat-number\">25+</div><div>Regions</div></div>");
            out.println("            <div class=\"stat-box\"><div>🏢</div><div class=\"stat-number\">200+</div><div>Services</div></div>");
            out.println("            <div class=\"stat-box\"><div>🔒</div><div class=\"stat-number\">99.99%</div><div>Uptime SLA</div></div>");
            out.println("            <div class=\"stat-box\"><div>⚡</div><div class=\"stat-number\">1M+</div><div>Active Customers</div></div>");
            out.println("        </div>");
            
            // Services Grid with Tooltips
            out.println("        <div class=\"services-grid\">");
            
            // EC2 with detailed tooltip
            addServiceWithTooltip(out, "☁️", "EC2", "Compute", 
                "Amazon Elastic Compute Cloud", 
                new String[]{
                    "Scalable virtual servers in the cloud",
                    "Pay only for what you use (per hour/second)",
                    "Multiple instance types for different workloads",
                    "Complete control over your computing resources",
                    "Integration with EBS, VPC, and Auto Scaling"
                });
            
            // S3 with tooltip
            addServiceWithTooltip(out, "🗄️", "S3", "Storage", 
                "Amazon Simple Storage Service", 
                new String[]{
                    "Industry-leading scalability and durability",
                    "11 9's of durability (99.999999999%)",
                    "Multiple storage tiers for cost optimization",
                    "Strong consistency and security features",
                    "Supports various use cases: backup, archive, analytics"
                });
            
            // RDS with tooltip
            addServiceWithTooltip(out, "💾", "RDS", "Database", 
                "Amazon Relational Database Service", 
                new String[]{
                    "Managed database service for 6+ engines",
                    "Automated backups and software patching",
                    "Multi-AZ deployment for high availability",
                    "Read replicas for read-heavy workloads",
                    "Encryption at rest and in transit"
                });
            
            // Lambda with tooltip
            addServiceWithTooltip(out, "⚡", "Lambda", "Serverless", 
                "AWS Lambda", 
                new String[]{
                    "Run code without provisioning servers",
                    "Pay only for compute time you consume",
                    "Automatic scaling from zero to thousands",
                    "Supports multiple programming languages",
                    "Integrates with 200+ AWS services"
                });
            
            // VPC with tooltip
            addServiceWithTooltip(out, "🌐", "VPC", "Networking", 
                "Amazon Virtual Private Cloud", 
                new String[]{
                    "Logically isolated cloud network",
                    "Complete control over IP addressing",
                    "Public and private subnets support",
                    "Security groups and NACLs for protection",
                    "VPN and Direct Connect connectivity"
                });
            
            // ELB with tooltip
            addServiceWithTooltip(out, "⚖️", "ELB", "Load Balancing", 
                "Elastic Load Balancing", 
                new String[]{
                    "Automatically distributes incoming traffic",
                    "Supports Application, Network, and Gateway load balancers",
                    "Integrated with Auto Scaling",
                    "Health checks for target monitoring",
                    "SSL/TLS termination support"
                });
            
            // CloudWatch with tooltip
            addServiceWithTooltip(out, "📈", "CloudWatch", "Monitoring", 
                "Amazon CloudWatch", 
                new String[]{
                    "Collects metrics from 70+ AWS services",
                    "Set alarms and automate responses",
                    "Log aggregation and analysis",
                    "Dashboard creation for visualization",
                    "Anomaly detection and forecasting"
                });
            
            // IAM with tooltip
            addServiceWithTooltip(out, "🔐", "IAM", "Security", 
                "AWS Identity and Access Management", 
                new String[]{
                    "Centralized access control for AWS",
                    "Fine-grained permissions management",
                    "Multi-factor authentication support",
                    "Integration with corporate directories",
                    "Audit access with AWS CloudTrail"
                });
            
            out.println("        </div>");
            out.println("    </div>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    private void addServiceWithTooltip(PrintWriter out, String icon, String title, String category, 
                                       String description, String[] keyPoints) {
        out.println("<div class='service-card'>");
        out.println("    <div class='service-icon'>" + icon + "</div>");
        out.println("    <div class='service-tag'>" + category + "</div>");
        out.println("    <h3>" + title + "</h3>");
        out.println("    <p style='color:#666; margin-top:0.5rem;'>" + description + "</p>");
        
        // Tooltip content
        out.println("    <div class='tooltip'>");
        out.println("        <h4>📌 " + title + " - Key Features</h4>");
        out.println("        <ul>");
        for (String point : keyPoints) {
            out.println("            <li>✓ " + point + "</li>");
        }
        out.println("        </ul>");
        out.println("    </div>");
        out.println("</div>");
    }
}
